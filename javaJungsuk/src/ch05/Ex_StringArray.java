package ch05;

import java.util.Arrays;

//가위바위보 게임
public class Ex_StringArray {

	public static void main(String[] args) {
		String[] arr = {"가위", "바위","보"};
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<10;i++) {
			int rd = (int)(Math.random()*3);//0~2까지 난수 
			System.out.println((i+1)+"번 : "+arr[rd]);
		}
		
		}//end main()
}
