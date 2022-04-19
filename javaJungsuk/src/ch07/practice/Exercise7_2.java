package ch07.practice;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i = 0; i<cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num==1||num==3||num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	public void shuffle() {
		
		for (int i = 0; i < cards.length; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			
			SutdaCard tmp = cards[i];
			cards[i] = cards[r];
			cards[r] = tmp;
		}
	}// end shuffle()
	
	public SutdaCard pick(int index) {
		if(index<0 || index>=CARD_NUM) 	// index 유효성 검사 
			return null;	
		
		return cards[index];
	}
	
	public SutdaCard pick() {
		int index = (int)(Math.random()*CARD_NUM);
//		return cards[index];
		return pick(index);
	}
	
}// end SutdaDeck

class SutdaCard {
	final int num;
	final boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info() Object toString() . 대신 클래스의 을 오버라이딩했다
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}


public class Exercise7_2 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println("deck.pick(0)="+deck.pick(0));
		System.out.println("deck.pick()="+deck.pick());	// 랜덤 인덱스 카드 뽑기 
		deck.shuffle();	// 카드 섞기 
		
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(i==0 ? "" + deck.cards[i] : ","+ deck.cards[i]);
//			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println("AFTER Shuffle deck.pick(0)="+deck.pick(0));	// 카드 섞은 후 첫 장 뽑기
	}// end main()
}
