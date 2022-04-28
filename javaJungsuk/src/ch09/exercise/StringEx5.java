package ch09.exercise;

import java.util.StringJoiner;

public class StringEx5 {	// 문자 인코딩 변환
	public static void main(String[] args) throws Exception{	
		String str = "가";
		
		byte[] bArr = str.getBytes("UTF-8");	// UTF-8 : 한 글자 당 3byte
		byte[] bArr2 = str.getBytes("CP949");	// CP949 : 한 글자 당 2byte
		
		System.out.println("UTF-8:" + joinByteArr(bArr));
		System.out.println("CP949:" + joinByteArr(bArr2));
		
		System.out.println("UTF-8:" + new String(bArr, "UTF-8"));
		System.out.println("CP949:" + new String(bArr2, "CP949"));
	}// end main()
	
	static String joinByteArr(byte[] bArr) {
		StringJoiner sj = new StringJoiner(":", "[", "]");
		
		for(byte b : bArr)	
			sj.add(String.format("%02X", b));
		
		return sj.toString();
		
	}// end joinByteArr()
	
}// end class
