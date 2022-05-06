package ch11.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();		// Queue 인터페이스의 구현체의 LinkedList를 사용 
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println(" = Stack = ");
		System.out.println("Before pop Stack: " + st);
		while(!st.empty()) {	// empty() : Stack 클래스 메서드 
			System.out.println(st.pop());
		}
		
		System.out.println("After pop Stack: " + st);	// pop() 후에는 빈 스택. 
		
		System.out.println();
		
		System.out.println(" = Queue = ");
		System.out.println("Before pop Queue: " + q);
		while(!q.isEmpty()) {	// isEmpty() : Collection 인터페이스 메서드 
			System.out.println(q.poll());
		}
		
		System.out.println("After poll Stack: " + q);	// poll() 후에는 빈 큐.
	}// main()

}
