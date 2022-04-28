package ch09.exercise;

import java.util.StringJoiner;

public class StringEx4 {
	public static void main(String[] args) {
		String animal = "dog,cat,bear";
		String[] arr = animal.split(",");
		
		System.out.println(String.join("-",arr));			// String.join()
		
		StringJoiner sj = new StringJoiner("/", "[", "]");	// new StringJoiner()
		
		for(String s : arr)
			sj.add(s);
		
		System.out.println(sj.toString());
	}
}
