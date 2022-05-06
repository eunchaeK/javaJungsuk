package ch11.exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {

	public static void main(String[] args) {

		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0 ; i < 10 ; i++)
			original.add(i+"");
		
		Iterator it = original.iterator();
		
		while(it.hasNext()) 
			copy1.add(it.next());
		
		System.out.println("= Original에서 copy1로 복사(copy) = ");
		System.out.println("original: " + original);
		System.out.println("copy1: " + copy1);
		System.out.println("copy2: " + copy2);
		System.out.println();
		
		it = original.iterator();	//Iterator는 일회용이므로, 다시 얻어와야함. 
		
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();	// remove() 사용하기 위해서는 next() 선행되야함. (읽어온 것 삭제)
		}
			
		System.out.println("= Original에서 copy2로 이동(move)) = ");
		System.out.println("original: " + original);
		System.out.println("copy2: " + copy2);
		
	}// main()

}
