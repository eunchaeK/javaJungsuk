package ch06.practice;

public class Exercise6_6 {

	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}//end main()
	
	// (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
	static double getDistance(int x, int y, int x1, int y1) {
		
		
		//메서드를 호출하는 것은 곱셈연산보다 비용이 많이 드는 작업
		return Math.sqrt(Math.pow((x-x1), 2)+Math.pow((y-y1), 2));
		
		//return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
	}

}
