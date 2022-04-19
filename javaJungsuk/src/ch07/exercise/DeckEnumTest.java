package ch07.exercise;

public class DeckEnumTest {
	public static void main(String[] args) {
		Deck deck = new Deck();		// 카드 한 벌(Deck)을 만든다.
		Card card = deck.pick(0);	// 섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(card);	//card.toString()
		
		int index = 0;
		for(Card c : deck.cardArr) {
			System.out.printf("cardArr[%d] : ", index++);
			System.out.println(c);
		}
		
		deck.shuffle();				// 카드를 섞는다.
		
		System.out.println("---------------shuffle 후-----------------");
		
		index = 0;
		for(Card c : deck.cardArr) {
			System.out.printf("cardArr[%d] : ", index++);
			System.out.println(c);
		}
		
		card = deck.pick(0);		// 섞은 후 제일 위의 카드를 뽑는다.
		System.out.println(card);
	}// end main()
	
	
	
}// end DeckTest

class Deck2{
	final int CARD_NUM=52;	// 카드의 개수 
	Card2 cardArr[] = new Card2[CARD_NUM];	//Card 객체 배열 포함 
	Kind kindArr[] = Kind.values();
	
	Deck2() {
		int i = 0;
		
		for(int k=Kind.values().length-1; k > 0 ; k--) {
			for (int n = 0; n < Card.NUM_MAX; n++) 
				cardArr[i++] = new Card2(kindArr[k], n+1);
		}
	}
	
	Card2 pick(int index) {
		return cardArr[index];
	}
	
	Card2 pick() {
		int index = (int)(Math.random() * CARD_NUM);	// 0<= index < 52
		return cardArr[index];
	}
	
	void shuffle() {// 카드의 순서를 섞는다.
		for(int i=0; i<cardArr.length;i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card2 tmp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = tmp;
		}
	}
}// end Deck

class Card2{
	static int KIND_MAX = 4;	// 카드 무늬 수 
	static int NUM_MAX = 13;		// 무늬별 카드 수 

	Kind kind;
	int number;
	
	Card2(){
		this(Kind.SPADE, 1);
	}
	
	Card2(Kind kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		String numbers = "0123456789XJQK";	// 숫자 10은 X로 표현
		
		return "kind : " + this.kind.toString() + ", number : " + numbers.charAt(this.number);
	}
}

