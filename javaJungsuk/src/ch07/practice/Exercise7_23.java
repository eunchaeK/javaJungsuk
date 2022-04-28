package ch07.practice;

abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0,0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
	
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p = p;
	}
}// class shape

class Point {
	int x;
	int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}// class Point

class Circle extends Shape{
	double r;	// 반지름

	Circle(){
		this(1.0);
	}
	
	Circle(double r){
		this(new Point(0,0), r);
	}
	
	Circle(Point p, double r){
		super(p);
		this.r = r;
	}
	
	@Override
	double calcArea() {
		return 0;
	}
	
}// class Circle

class Rectangle extends Shape{
	double width;	// 폭
	double height;	// 높이
	
	Rectangle(){
		this(1.0, 1.0);
	}
	
	Rectangle(double width, double height){
		this(new Point(0,0), width, height);
	}
	
	Rectangle(Point p, double width, double height){
		super(p);
		this.width = width;
		this.height = height;
	}
	
	boolean isSquare() {
		return (width*height)!=0 && width==height;
	}
	
	@Override
	double calcArea() {
		return 0;
	}
	
}//class Rectangle

public class Exercise7_23 {
	private static final Shape Circle = null;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합 :"+ sumArea(arr)); 
		
		System.out.println("실행 시간 : " + (System.currentTimeMillis() - start) + "ms");
	}
	
	private static double sumArea(Shape[] arr) {
		double totalSum = 0;
		Circle c = null;
		Rectangle r = null;
		
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] instanceof Circle) {
				c = (Circle)arr[i];
				totalSum += (Math.pow(c.r, 2) * Math.PI);
//				totalSum += (c.r *c.r * Math.PI);
			}else if(arr[i] instanceof Rectangle) {
				r = (Rectangle)arr[i];
				totalSum += (r.width * r.height);
			}
		}// end of for
		
		return totalSum;
	}// sumArea()
}
