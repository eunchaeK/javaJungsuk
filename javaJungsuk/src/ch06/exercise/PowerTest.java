package ch06.exercise;

public class PowerTest {
	public static void main(String[] args) {
		int x = 2, n = 5;
		
		long result = 0;
		
		for (int i = 1; i <= n; i++) {
			result += power(x, i);
			System.out.printf("%d의 %d제곱까지 합: %d%n", x, i, result);
		}
		
		System.out.println("result="+ result);
		
	}// end main()
	
	static long power(int x, int n) {
		if(n==1) return x;
		return x * power(x, n-1);
	}

}
