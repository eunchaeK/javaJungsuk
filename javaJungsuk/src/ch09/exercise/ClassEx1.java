package ch09.exercise;

final class Card{
	String kind;
	int num;
	
	Card(){
		this("SPADE", 1);
	}

	public Card(String kind, int num) {
		super();
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", num=" + num + "]";
	}
	
}

public class ClassEx1{
	public static void main(String[] args) throws Exception {
		Card c = new Card("HEART", 3);			// new 연산자로 객체 생성
		Card c2 = Card.class.newInstance();		// Class 객체를 이용해서 객체 생성 
		
		Class cObj = c2.getClass();
		Class cObj2 = new Card().getClass();	// 생성된 객체로 부터 얻는 방법
		Class cObj3 = Card.class;				// 클래스 리터럴(*.class)로 부터 얻는 방법 
//		Class cObj4 = Class.forName("Card");
		
		System.out.println(c);
		System.out.println(c2);
		
		System.out.println(cObj);
		System.out.println(cObj2);
		System.out.println(cObj3);
//		System.out.println(cObj4);
		
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}
	
}
