package ch06.practice;

class Exercise6_22 {
	public static boolean isNumber(String str) {//o123
		boolean chk=true;
		String num = "0123456789";
		
		for(int i = 0; i<str.length();i++) {
			
			if(str==null || str.equals(""))
				return false;
			
			for(int j = 0; j<num.length();j++) {
				if(!(str.charAt(i)==num.charAt(j))) {
					chk = false; 
				}else {
					chk = true;
					continue;
				}
				//chk = (str.charAt(i)==num.charAt(j)? true:false);
			}//end inner for 
			
		}//end for 
		return chk;
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
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str)); 
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}//end main()
}//end class

