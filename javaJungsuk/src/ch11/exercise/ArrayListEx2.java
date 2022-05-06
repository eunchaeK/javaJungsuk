package ch11.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
		final int LIMIT = 10;
		String source = "0123456789abcdefghijABCEDFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();	// 43
		
		List list = new ArrayList(length/LIMIT + 10);	// ArrayList 생성 시 크기 여유있게 지정
		
		for(int i = 0 ; i < length ; i += LIMIT) {
			if(i+LIMIT < length)
				list.add(source.substring(i, i + LIMIT));
			else
				list.add(source.substring(i));
		}
		
		for(int i=0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}

	}// main()

}
