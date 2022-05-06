package ch11.exercise;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0);
		}

		Stack st = new Stack();
		String expression = args[0];
		
		try {
			
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch=='(') {
					st.push(ch+"");
				}else if(ch==')') {
					st.pop();
				}
			}// end of for
			
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			}else {	// '('가 더 많을 때 
				System.out.println("else : 괄호가 일치하지 않습니다.");
			}
				
			
		} catch (EmptyStackException e) {	// ')'가 더 많을 때 예외처리 
			System.out.println("catch: 괄호가 일치하지 않습니다.");
		}finally {
			System.out.println("Stack : " + st);
		}
		
	}// main()

}
