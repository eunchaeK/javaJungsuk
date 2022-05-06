package ch11.exercise;

public class MyStackTest {

	public static void main(String[] args) {
		MyStack st = new MyStack();
		st.push("1");
		st.push("4");
		st.push("9");
		st.push("6");
		
		System.out.println("Stack : " + st);
		
		System.out.println("search(4):" + st.search("4"));
		System.out.println("search(6):" + st.search("6"));
		System.out.println("search(7):" + st.search("7"));
		
	}// main()

}
