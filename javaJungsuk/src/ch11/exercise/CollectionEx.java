package ch11.exercise;

import java.util.*;
import static java.util.Collections.*;

public class CollectionEx {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);
		System.out.println("addAll: "+list);
		
		rotate(list, 2);	// 오른쪽으로 두 칸씩 이동 
		System.out.println("rotate: "+list);
		
		swap(list, 0, 2);	// 첫 번쨰와 세 번째를 교환(swap)
		System.out.println("swap: "+list);
		
		shuffle(list);		// 저장된 요소의 위치를 임의로 변경
		System.out.println("shuffle: "+list);
		
		sort(list, reverseOrder());
		System.out.println("sort: " + list);
		
		int idx = binarySearch(list, 3);	// 3이 저장된 위치(index) 반환
		System.out.println("index of 3: " + idx);
		
		System.out.println("max=" + max(list));
		System.out.println("min="+min(list));
		System.out.println("min="+max(list, reverseOrder()));
		
		fill(list, 9);	// list를 9로 채운다
		System.out.println("fill: " + list);
		
		// list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
		List newList = nCopies(list.size(), 2);
		System.out.println("newList=" + newList);
		
		System.out.println(disjoint(list, newList)); 	// 공통요소가 없으면 true
		
		copy(list, newList);
		System.out.println("== After copy ==");
		System.out.println("newList=" + newList);
		System.out.println("list=" + list);
		
		replaceAll(list, 2, 1);
		System.out.println("replaceAll=" + list);
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		
		System.out.println("list2=" + list2);
	}// main()
}
