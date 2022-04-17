package ch06.practice;

class Exercise6_2 {//java 파일 명 = main() 있는 클래스명
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info()); // 3 . 이 출력된다
		System.out.println(card2.info()); // 1K . 가 출력된다
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
	this(1, true); // SutdaCard(1, true) . 를 호출한다
	}
	
	SutdaCard(int num, boolean isKwang) {
	this.num = num;
	this.isKwang = isKwang;
	}
	
	String info() { // . ( ) K . 숫자를 문자열로 반환한다 광 인 경우 를 덧붙인다 光
	return num + ( isKwang? "K" : "");
	}
}
