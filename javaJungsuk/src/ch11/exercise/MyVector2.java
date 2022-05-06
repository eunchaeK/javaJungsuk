package ch11.exercise;

import java.util.Iterator;

public class MyVector2 extends MyVector implements Iterator{

	int cursor = 0;		// 앞으로 읽어 올 요소의 위치를 저장
	int lastRet = -1;	// 마지막으로 읽어 온 요소 위치(index)
	
	public MyVector2(int capacity) {
		super(capacity);
	}
	
	public MyVector2() {
		this(10);
	}
	
	public String toString(){
		String tmp = "";
		Iterator it = iterator();
		
		for(int i = 0; it.hasNext() ; i++) {
			if(i!=0) tmp += ", ";
			tmp += it.next();		// tmp += next().toString();
		}
		return "[" + tmp + "]";
	}
	
	public Iterator iterator() {	// cursor와 lastRet를 초기화. 
		cursor = 0;
		lastRet = -1;
		return this;
	}
	
	public boolean hasNext() {
		return cursor != size();
	}
	
	public Object next() {
		Object next = get(cursor);
		lastRet = cursor++;			// lastRet=cursor -> cursor++
		return next;
	}
	
	public void remove() {
		System.out.println("MyVector2 remove");
		// 더이상 삭제할 것이 없으면 IllegalStateException를 발생시킨다. 
		if(lastRet==-1) {
			throw new IllegalStateException();
		}else {
			remove(lastRet);
			cursor--;			// 삭제 후에 cursor의 위치를 감소	
			lastRet = -1;		// lastRet의 값을 초기화
		}
	}
	
}// end class

