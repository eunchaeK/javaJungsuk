package ch09.exercise;

import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
		// 같은 종자값 갖는 Random 인스턴스는 시스템이나 실행시간 등에 관계 없이 항상 같은 값 & 같은 순서 반환 보장
		Random rand = new Random(1);	
		Random rand2 = new Random(1); 
		
		System.out.println("= rand =");
		for (int i = 0 ; i < 5 ; i++) 
			System.out.println(i + ":" + rand.nextInt());
		
		System.out.println();
		System.out.println("= rand2 =");
		for (int i = 0 ; i < 5 ; i++) 
			System.out.println(i + ":" + rand2.nextInt());
		
	}// end main()
}
