package ch11.exercise;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

import javax.naming.LinkLoopException;

public class QueueEx1 {

	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;		// Queue에 최대 5개까지만 저장. 
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			
			System.out.print(">>");
			
			try {
				// 화면으로부터 라인단위로 입력받는다. 
				Scanner sc = new Scanner(System.in);
				String input=sc.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
				}else if(input.equals("history")) {
					int i=0;
					// 입력받은 명령어를 저장하고, 
					save(input);
					
					// LinkedList의 내용을 보여준다. 
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) 
						System.out.println(++i + "." + it.next());
				}else {
					save(input);
					System.out.println(input);
				}
				
			} catch (Exception e) {
				System.out.println("입력오류입니다.");
			}
		}// end of while(true)
		
	}// main()

	public static void save(String input) {
		// q에 저장한다. 
		if(!"".equals(input))
			q.offer(input);
		
		// 저장 후, q의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다. 
		if(q.size() > MAX_SIZE)		// size()는 Collection인터페이스에 정의 
			q.remove();
	}// save()
	
}
