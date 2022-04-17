package ch06.practice;

public class Exercise6_20 {
	
	public static int[] shuffle(int[] arr) {
		//유효성 체크 
		if(arr==null || arr.length==0)
			return arr;
		
		//랜덤 인덱스 값 구하기 
		for(int i=0 ; i < arr.length ; i++) {
			int j = (int)(Math.random()*arr.length); //random(): 0.0>= && < 1.0
			
			// arr[i] arr[j] . 와 의 값을 서로 바꾼다
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
			return arr;
	}
	
	
	public static void main(String[] args){
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}//end main()
	
}
