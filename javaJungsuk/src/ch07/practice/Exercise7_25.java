package ch07.practice;

import ch07.practice.Outer.Inner;
import ch07.practice.Outer.Inner2;

class Outer{
	class Inner{
		int iv = 100;
	}
	
	static class Inner2{
		int iv = 200;
	}
}

public class Exercise7_25 {

	public static void main(String[] args) {
		System.out.println("-------Exercise7_25----------");
		Inner i = new Outer().new Inner();
		System.out.println("Inner iv:" + i.iv);
		
		System.out.println();
		
		System.out.println("-------Exercise7_26----------");
		Inner2 i2 = new Outer.Inner2();		// static class는 Outer 클래스 생성없이 사용 가능 
		System.out.println("Inner2 iv:" + i2.iv);
		
	}// main()

}
