package ch09.exercise;

class Point implements Cloneable{	//Clonnable 인터페이스를 구현한 클래스만 clone() 호출 가능 
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public Point clone() {	//JDK1.5부터 '공변 변환타입(convariant return type) 추가 
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Point)obj;
	}

}// end Point 


public class CloneEx1 {
	public static void main(String[] args) {
		Point original = new Point(3, 3);
		Point copy = original.clone();
		original.x=5;
		System.out.println(original);
		System.out.println(copy);
		System.out.printf("original==copy : %b", original==copy);
	}
}
