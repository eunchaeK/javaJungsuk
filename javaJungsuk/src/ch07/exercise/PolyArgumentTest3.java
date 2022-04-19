package ch07.exercise;

import java.util.Vector;

class Product{
	int price;
	int bonusPoint;
	
	Product(){}
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
}// end Product

class Tv extends Product{
	Tv(){super(100);}
	
	@Override
	public String toString() {return "Tv";}

}// end Product

class Computer extends Product{
	Computer(){super(200);}
	
	@Override
	public String toString() {return "Computer";}

}// end Computer

class Audio extends Product{
	Audio(){super(70);}
	
	@Override
	public String toString() {return "Audio";}
}// end Audio


class Buyer{
	int money=1000;			// 보유금액
	int bonusPoint=0;		// 보너스 포인트
	Vector<Product> items = new Vector<Product>();	// 구입한 제품을 저장하는 Vector 객체
	
	Buyer(){}
	
	/* 제품 구입하기  */
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 구입할 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		items.add(p);		// 구입한 제품을 Vector에 저장.
		System.out.println(p + "을(를) 구입하셨습니다.");
	}	
	
	/* 구입한 제품 환불하기 */
	void refund(Product p) {
		if(items.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을(를) 반품하셨습니다.");
			
		}else { // 제거에 실패한 경우 
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	/* 구입한 제품에 대한 정보 요약  */
	void summary() {
		int sum = 0;			// 구입한 물품의 가격합계
		String itemList ="";	// 구입한 물품목록 
		
		int index=0;
		for(Product p : items) {
			if(p==null) break;
			sum += p.price;
			itemList += index++ ==0 ? "" + p : "," + p;
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다. ");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}// end Buyer

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		
//		b.buy(new Tv());
		b.buy(tv);
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();

		System.out.println();
		b.refund(tv);
		b.summary();

	}// end main()
}
