package ch09.practice;

public class Exercise9_9 {

	private static String delChar(String src, String delch) {
		long start = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer(src);
		for(int i=0 ; i<sb.length(); i++) {
			if(delch.indexOf(sb.charAt(i))!=-1)
				sb.deleteCharAt(i);
		}
		
		System.out.println("delCh 실행 시간: " + (System.currentTimeMillis()-start) + "ms");
		return sb.toString();
	}// delChar()
	
	public static void main(String[] args) {
			System.out.println("(1!2@3^4~5)"+" -> "
				+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));
			System.out.println("(1 2 3 4\t5)"+" -> "
				+ delChar("(1 2 3 4\t5)"," \t"));
			System.out.println("(1!2@3^4~525235353~!25325@332*&etew)"+" -> "
					+ delChar("(1!2@3^4~525235353~!25325@332*&etew)","~!@#$%^&*()"));
	}// main()
}
