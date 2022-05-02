package ch09.practice;

public class Exercise9_5 {

	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치
		
		/*
		(1) . 반복문을 사용해서 아래의 과정을 반복한다
		1. src target pos . 에서 을 의 위치부터 찾는다
		2. count 1 , 찾으면 의 값을 증가 시키고
		pos target.length . 의 값을 만큼 증가시킨다
		3. indexOf -1 count . 의 결과가 이면 반복문을 빠져나가서 를 반환한다
		*/
		
		while(true) {
			pos = src.indexOf(target, pos);
			if(pos!=-1) {
				count++;
				pos += target.length();
				System.out.println("pos:" + pos);
				
			}else break;
		}
		
		return count;
	}//count()
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
	}

}
