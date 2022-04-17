package ch06.practice;

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		//클래스 메서드 호출('클래스 이름.메서드이름()')
		return Exercise6_6.getDistance(x, y, x1, y1);
		
		//인스턴스 변수 사용 -> static 메서드 안됨 
		//return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
	}
	
}//end MyPoint

class Exercise6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1,1);
		// p (2,2) . 와 의 거리를 구한다
		System.out.println(p.getDistance(2,2));
	}//end main()
}
