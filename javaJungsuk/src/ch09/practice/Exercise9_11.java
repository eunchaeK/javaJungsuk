package ch09.practice;

public class Exercise9_11 {
	public static void main(String[] args) {
		
		int min = 0;
		int max = 0;
		
		try
		{
			if(args.length != 2) // 입력 값이 2개가 아닐 경우 
				throw new Exception("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
			
			// 입력 값이 2개인 경우
			try 
			{   // 두 값 중 작은 값을 min, 큰 값을 max 참조변수에 저장
				min = Math.min(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
				max = Math.max(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
			}
			catch(NumberFormatException e) 	// 정수로 변환 안 될 경우 예외 처리 
			{	
				System.out.println("숫자만 입력 가능합니다.\n");
				System.exit(0);
			}
			
			if (!(1< min && min <= 9 && 1<max && max <= 9)) // 입력값이 2개이고, 두 값 모두 2에서 9사이가 아닌 경우 
				throw new Exception("단의 범위는 2와 9 사이의 값이어야 합니다.");
			
			for (int i = min; i <= max; i++) 
			{
				for (int j = 1; j <= 9; j++) 
					System.out.printf("%d * %d = %d%n", i, j, i*j);
				System.out.println();
			}
			
			System.out.println("프로그램 종료.");
				
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}
	}// main()
}// end class
