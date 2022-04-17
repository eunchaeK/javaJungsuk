package ch06.practice;

public class Student {
	String name; //학생이름
	int ban; 	 //반
	int no; 	 //번호
	int kor; 	 //국어점수
	int eng;  	 //영어점수
	int math; 	 //수학점수

	public Student() {}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return Math.round((getTotal()/3f)*10)/10f;
		//return (int)(getTotal() / 3f * 10 + 0.5f) / 10f; //평균값 구할 때 3f로 나누기 
	}
	
	String info() {
		//return String.format("%s, %d, %d, %d, %d, %d, %d, %.1f", 
		//						name, ban, no, kor, eng, math, getTotal(), getAverage());
		
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage()
				;
				
	}
	
}//end Student