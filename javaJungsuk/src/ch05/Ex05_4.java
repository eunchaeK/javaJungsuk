package ch05;

import java.util.Arrays;

//로또 값 구하기
public class Ex05_4 {

	public static void main(String[] args) {
		int[] x= {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(x));
		
		for(int i = 0; i<x.length;i++) {
			int n=(int)(Math.random()*10); //0~9 중의 한 값을 임의로 얻는다.
			int tmp = x[i];
			x[i] = x[n];
			x[n] = tmp;
		}
		
		System.out.println(Arrays.toString(x));
	}//end main()

}
