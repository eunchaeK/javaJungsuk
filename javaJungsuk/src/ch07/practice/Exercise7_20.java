package ch07.practice;

class Exercise7_20 {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		System.out.println("p.x = " + p.x);		// 100
		p.method();								// Child Method	
		System.out.println("c.x = " + c.x);		// 200
		c.method();								// Child Method
		
//		메서드의 경우 조상 클래스의 메서드를 자손의 클래스에서 오버라이딩한 경우에는 
//		참조변수의 타입에 관계없이 항상 실제 인스턴스의 메서드(오버라이딩된 메서드)가 호출되지만 ,
//		멤버변수의 경우 참조변수의 타입에 따라 달라진다.
	}
}

class Parent {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;
	void method() {
		System.out.println("Child Method");
	}
}