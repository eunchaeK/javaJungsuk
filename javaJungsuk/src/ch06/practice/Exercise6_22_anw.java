package ch06.practice;

class Exercise6_22_anw {
	public static boolean isNumber(String str) {//o123
		
		if(str==null || str.equals(""))
			return false;
		
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(c<'0'||c>'9')
				return false;
		}
			
		return true;
		
	}//end isNumber()
	
	/*
메서드명 : isNumber
기 능 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다 : .
모두 숫자로만 이루어져 있으면 를 반환하고 true ,
그렇지 않으면 를 반환한다 false .
만일 주어진 문자열이 이거나 빈문자열 이라면 를 반환한다 null “” false .
반환타입 : boolean
매개변수 검사할 문자열
	 */
	public static void main(String[] args) {
		String str = "0123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str)); 
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}//end main()
}//end class

