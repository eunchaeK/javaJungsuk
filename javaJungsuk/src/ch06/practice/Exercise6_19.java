package ch06.practice;

class Exercise6_19{
	public static void change(String str) {
		//메서드 change에서는 넘겨받은 문자열의 뒤에 "456"을 붙인다.
		//문자열은 내용을 변경할 수 없기 때문에 덧셈연산을 하면 새로운 문자열(객체)이 생성되고 
		//새로운 문자열의 주소가 변수 str에 저장된다
		str += "456";
		System.out.println("str="+str);
	}
	
	public static void main(String[] args){
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str);
	}//end main()
}
