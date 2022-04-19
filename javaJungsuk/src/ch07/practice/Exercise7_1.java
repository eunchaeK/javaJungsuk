
package ch07.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	final int[] kangNum = {1,3,8};
	
	SutdaDeck() {
		/*
		(1) SutdaCard . 배열을 적절히 초기화 하시오
		*/
		int min = 1;		// 카드에 들어가는 최소 숫자 
		int max = 10;		// 카드에 들어가는 최대 숫자 
		int index = min; 	// 카드 숫자 인덱스 
		int round = 0;		// 1~10까지 돈 횟수
		
		for(int i = 0 ; i < CARD_NUM ; i++) {
			
			if(round == 0 && contains(index))
				cards[i] = new SutdaCard(index++, true);
			else 
				cards[i] = new SutdaCard(index++, false);
			
			if(index > max) {
				round++;
				index = min;
			}
			
		}//end for문
	}
	
	private boolean contains(final int key) {// kangNum에 index가 포함되어있는지 확인
	    return Arrays.stream(kangNum).anyMatch(i -> i == key);
	}
	
}// end SutdaDeck

class SutdaCard {
	int num;
	boolean isKwang;
	
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
}// end SutdaCard

public class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0 ; i < deck.cards.length ; i++)
			System.out.print(deck.cards[i]+",");
	}
}
