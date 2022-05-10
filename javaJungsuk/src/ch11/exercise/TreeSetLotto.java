package ch11.exercise;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
		}
		
		System.out.println(set); 	// TreeSet은 저장할 때 정렬 -> 따로 정렬 필요 x
	}// main()
}
