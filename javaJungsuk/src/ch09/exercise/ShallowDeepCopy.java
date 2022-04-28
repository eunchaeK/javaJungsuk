package ch09.exercise;

class Circle implements Cloneable{
	Point p;	// 원점
	double r;	// 반지름 
	
	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	public Circle shallowCopy() {	// 얕은 복사(공변 변환타입 Object -> Circle)
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return (Circle)obj;	
		
	}// end shallowCopy()
	
	public Circle deepCopy() { // 깊은 복사 
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		Circle c = (Circle)obj;
		c.p = new Point(this.p.x, this.p.y);
		
		return c;
		
	}// end deepCopy()

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	
}// end Circle

class Point{
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}// end Point 

public class ShallowDeepCopy {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(1,1), 2.0);
		Circle c2 = c1.shallowCopy();
		Circle c3 = c1.deepCopy();
		
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
		
		c1.p.x = 9;
		c1.p.y = 9;
		
		System.out.println("=====c1 변경 후======");
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
		
	}// end main()
}// end class
