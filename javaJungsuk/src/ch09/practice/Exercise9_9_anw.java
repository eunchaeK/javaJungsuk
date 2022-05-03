package ch09.practice;

public class Exercise9_9_anw {
	public static String delChar(String src, String delCh) {
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer(src.length());
		
		for(int i = 0; i < src.length() ; i++) {
			char ch = src.charAt(i);
			
			// ch가 delCh에 포함되어있지 않으면 sb에 추가 
			if(delCh.indexOf(ch)==-1)
				sb.append(ch);
		}
		
		System.out.println("delCh 실행 시간: " + (System.currentTimeMillis()-start) + "ms");
		return sb.toString();
	}// delChar()
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+" -> "
				+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)"+" -> "
				+ delChar("(1 2 3 4\t5)"," \t"));
	}
}
