package ch09.practice;

public class Exercise9_2 {

	public static void main(String[] args) {
		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);
		Point3D p3 = p1;
		
		System.out.println(p1);		// toString
		System.out.println(p2);		// toString
		System.out.println("p1==p2?"+(p1==p2));					// 주소값 비교 
		System.out.println("p1==p3?"+(p1==p3));					// 주소값 비교 
		System.out.println("p1.equals(p2)?"+(p1.equals(p2)));	// 멤버변수 비교 
	}// main()

}

class Point3D {
	int x,y,z;
	
	Point3D(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	Point3D() {
		this(0,0,0);
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Point3D) {
			Point3D point = (Point3D)obj;
			return point.x==x && point.y==y && point.z == z;
		}
		return false;
	}
	
	public String toString() {
		return String.format("[%d,%d,%d]", x,y,z);
	}
}
