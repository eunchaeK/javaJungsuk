package ch08.practice;

class Exercise8_7 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) 
				System.exit(0);		// 프로그램 즉시 정상 종료. (finally 실행 x)
			System.out.println(2);
		} catch(RuntimeException r) {
			System.out.println(3);
			return;
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		
		System.out.println(6);
		
	}//end method()
	
	public static void main(String[] args) {
		method(true);
		method(false);
	} // main
}