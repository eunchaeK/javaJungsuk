package ch11.exercise;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr);
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);		// 대소문자 구분 안 함.
		System.out.println("strArr="+Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending());
		System.out.println("strArr="+Arrays.toString(strArr));
		
	}// main()
}

class Descending implements Comparator{ // 내림차순 정렬 
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			// 기본 정렬방식의 역으로 변경한다.
			return c1.compareTo(c2) * -1;		// c2.compareTo(c1)
		}
		return -1;
	}
}
