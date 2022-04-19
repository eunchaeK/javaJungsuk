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


class Buyer{
	int money;		// 보유금액
	int bonusPoint;		// 보너스 포인트
	
	Buyer(){this(1000, 0);}
	
	Buyer(int money){this(money, 0);}
	
	Buyer(int money, int bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 구입할 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
		System.out.println("현재 잔액은 " + money +"만원입니다.");
	}
}//end Buyer


public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer(2000);
		b.buy(new Tv());
		b.buy(new Computer());
	}
	
	
}
