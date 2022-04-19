package ch07.exercise;

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
	Product[] items = new Product[10];	// 구입한 제품을 저장하는 배열
	int i=0;			// Product 배열에 사용될 포인터 				
	
	Buyer(){}
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 구입할 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		items[i++] = p;				// 제품을 Product[] item에 저장한다. 
		System.out.println(p + "을(를) 구입하셨습니다.");
	}	
	
	void summary() {// 구매한 물품에 대한 정보를 요약해서 보여준다. 
		int sum = 0;			// 구입한 물품의 가격합계
		String itemList ="";	// 구입한 물품목록 
		
		int index=0;
		for(Product p : items) {
			if(p==null) break;
			sum += p.price;
//			itemList += p + ",";
			itemList += index++ ==0 ? "" + p : "," + p;
		}
//		System.out.println("index="+index);
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다. ");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}// end Buyer


public class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		b.summary();
	}//end main()
}
