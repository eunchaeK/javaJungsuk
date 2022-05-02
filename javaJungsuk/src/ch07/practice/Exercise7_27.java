package ch07.practice;

import ch07.practice.Outer.Inner;

class Outer{
	int value=10;
	
	class Inner{
		int value = 20;
		
		void method1() {
			int value=30;
			
			System.out.println(value);				// 30
			System.out.println(this.value);			// 20 
			System.out.println(Outer.this.value);	// 10 : 외부클래스이름.this.변수이름
		}
	}// class Inner
}

public class Exercise7_27 {

	public static void main(String[] args) {
		Inner inner = new Outer().new Inner();
		inner.method1();
	}

}
