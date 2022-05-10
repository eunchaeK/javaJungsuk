package ch11.exercise;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx5 {
	public static void main(String[] args) {
		
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();		// 합집합
		HashSet setKyo = new HashSet();		// 교집합
		HashSet setCha = new HashSet();	// 차집합 
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8");
		System.out.println("B = " + setB);
		
		Iterator it = setB.iterator();
		while(it.hasNext()) {	
			Object tmp = it.next();
			if(setA.contains(tmp))
				setKyo.add(tmp);	// 교집합에 넣기
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);	// 차집합에 넣기 
		}
		
		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());	// set은 중복값 허용 x
		
		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());	// set은 중복값 허용 x
		
		System.out.println("A ∩ B = " + setKyo);
		System.out.println("A ∪  B = " + setHab);
		System.out.println("A - B = " + setCha);
		
	}// main()
}
