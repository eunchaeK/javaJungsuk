package ch09.practice;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] stringSplit;
		
		int min, max;
		
		while(true) 
		{
			System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요. 예) 3 5");
			System.out.print("입력: ");
			
			stringSplit = sc.nextLine().trim().split("\\s+");	// 공백으로 문자열 자르기 
			
			
			if(stringSplit.length != 2) // 입력 값이 2개가 아닌 경우 
			{
				System.out.println("두 개의 값을 입력해야합니다. 다시 입력하세요.\n");
			}
			else // 입력 값이 2개인 경우
			{	
				try // 두 값 중 작은 값을 min, 큰 값을 max iv에 저장
				{ 
					min = Math.min(Integer.parseInt(stringSplit[0]), Integer.parseInt(stringSplit[1]));
					max = Math.max(Integer.parseInt(stringSplit[0]), Integer.parseInt(stringSplit[1]));
				}
				catch(NumberFormatException e) // 정수로 변환 안 될 경우 예외 처리 
				{	
					System.out.println("숫자만 입력 가능합니다.\n");
					continue;	// 예외 처리 후 다시 무한 루프문으로 이동
				}
				
				if ( 1< min && min <= 9 && 1<max && max <= 9) // 입력값이 2개이고, 두 값 모두 2에서 9사이인 경우
					break;	// 무한 루프 빠져 나가기
				else // 2에서 9사이 값이 아닌 경우 
					System.out.println("2에서 9 사이의 값만 입력 가능합니다. 다시 입력하세요.\n");
			}	
		}// end of while(true)
		
		
		for (int i = min; i <= max; i++) // 구구단 출력
		{	
			for (int j = 1; j <= 9; j++) 
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			System.out.println();
		}
		
		
		sc.close();	// Scanner 종료 
		
		System.out.println("프로그램 종료.");
		
	}// main()
}
