package ch06.practice;

/* 실행결과 
 	5 :5 의 절대값
	-10 :10 의 절대값
 */

class Exercise6_24{
/*
메서드명 : abs
기 능 주어진 값의 절대값을 반환한다 : .
반환타입 : int
매개변수 : int value
 */
	public static int abs(int value) {
		/*
		if(value < 0)
			return -value;
		else	
			return value;	
		*/
		
		//return value >=0 ? value : -value;
		
		return value < 0 ? -value : value;
	}

	public static void main(String[] args){
		int value = 50;
		System.out.println(value+"의 절대값 :"+abs(value)); 
		value = -10;
		System.out.println(value+"의 절대값 :"+abs(value)); 
	}//end main()
}//end class