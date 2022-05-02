package ch09.practice;

import java.util.Arrays;

public class Exercise9_6 {

	public static String fillZero(String src, int length) {
//		1. src가 널이거나 src.length()가 length와 같으면 src 그대로 반환
		if(src==null || src.length()==length) return src;
//		2. length의 값이 0보다 같거나 작으면 빈 문자열("")을 반환
		if(length<=0) return "";
//		3. src의 길이가 length의 값보다 크면 src를 length만큼 잘라서 반환
		if(src.length()>length) return src.substring(0,length);
		
//		4. 길이가 length인 char 배열 생성
		char[] charArr = new char[length];
		
//		5. 4에서 생성한 char배열을 '0'으로 채우기.
//		for (int i = 0; i < charArr.length; i++) 
//			charArr[i] = '0';
		
		Arrays.fill(charArr, '0');
		
//		6. src에서 문자배열 뽑아내서 4에서 생성한 배열에 복사.
		System.arraycopy(src.toCharArray(), 0, charArr, length-src.length(), src.length());
		
//		7. 4에서 생성한 배열로 String 생성해서 반환
		return new String(charArr);
		
	}// fillZero()
	
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}

}
