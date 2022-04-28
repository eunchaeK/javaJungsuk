package ch09.exercise;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] argArr = null;
		
		while(true) {
			String prompt = ">>";
			System.out.print(prompt);
			
			// 화면으로부터 라인단위로 입력받는다.(앞뒤 공백 제거)
			String input = sc.nextLine().trim();
			
			argArr = input.split(" +");	// 입력받은 내용을 공백을 구분자로 하여 자른다.
			
			String command = argArr[0].trim().toLowerCase();	// 명령어를 소문자로 바꾼다.
			
			if ("".equals(command)) continue;
			
			// q or Q를 입력하면 실행 종료.
			if (command.equals("q")) {
				System.exit(0);
			}else {
				for (int i = 0; i < argArr.length; i++) {
					System.out.println(argArr[i]);
				}
			}
			
		}// while(true)
		
	}// end main()
}
