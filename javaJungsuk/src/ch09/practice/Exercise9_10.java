package ch09.practice;

import java.util.Arrays;

public class Exercise9_10 {

	private static String format(String str, int length, int alignment) {
		if(str.length() > length) return str.substring(0, length);
		
		char[] charArr = new char[length];
		char[] src = str.toCharArray();
		switch (alignment) {
		case 0:
			System.arraycopy(src, 0, charArr, 0, str.length());
			break;
		case 1:
			System.arraycopy(src, 0, charArr, (length-str.length())/2, str.length());
			break;
			
		default:
			System.arraycopy(src, 0, charArr, length-str.length(), str.length());
//			break;
		}
		
		return new String(charArr);		
	}// format()
	
	public static void main(String[] args) {
		String str = "가나다"; 
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬
	}

}
