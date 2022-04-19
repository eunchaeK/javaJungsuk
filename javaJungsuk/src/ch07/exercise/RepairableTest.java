package ch07.exercise;

abstract class Unit{
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP = hp;
	}
	
	void attack(Unit u) {// 일반 공격(1번)
		attack(u, 1);
	}		
	
	void attack(Unit u, int num) {// 일반 공격(n번)
		
		if(u.hitPoint==0) {
			System.out.println("상대의 HP가 0이므로 공격할 수 없습니다.");
			return;
		}
		
		for(int i = 1; i <= num ; i++) {
			if(u.hitPoint==0) {
				System.out.println("상대의 HP가 0이 되었습니다.");
				return;
			}
		
			u.hitPoint--;
			System.out.printf("%s에게 공격!!%n", u.toString());
		}
		
		System.out.printf("%s의 HP : %d%n", u.toString(), u.hitPoint);
	}
	
	abstract void specialAttack(Unit u);	// 필살기
	
}// end Unit

class GroundUnit extends Unit{
	GroundUnit(int hp) {
		super(hp);
	}
	
	@Override
	void specialAttack(Unit u) {
		System.out.printf("%s에게 %s의 필살공격!!!!!!!! %n", u.toString(), this.toString());
		u.hitPoint=0;
		System.out.printf("%s의 HP가 소진되었습니다.(현재 HP:%d)%n", u, u.hitPoint);
	}
}// end GroundUnit

class AirUnit extends Unit{
	AirUnit(int hp) {
		super(hp);
	}
	
	@Override
	void specialAttack(Unit u) {
		System.out.printf("%s에게 %s의 필살공격!!!!!!!! %n", u.toString(), this.toString());
		u.hitPoint=0;
		System.out.printf("%s의 HP가 소진되었습니다.(HP:%d)%n", u, u.hitPoint);
	}
	
}// end AirUnit

class Tank extends GroundUnit implements Repairable{
	Tank() {
		super(10);
		hitPoint = MAX_HP;
	}
	
	public String toString() {return "Tank";}
	
}// end Tank

class DropShip extends AirUnit implements Repairable{
	DropShip() {
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {return "DropShip";}
}// end DropShip

class Marine extends GroundUnit{
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
	
	public String toString() {return "Marine";}
}// end Marine

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u =(Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;	// Unit의 HP를 증가시킨다. 
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다. ");
			System.out.printf("수리 후 %s의 HP : %d%n", u.toString(), u.hitPoint);
		}
	}// end repair()
}// end SCV

public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		DropShip dropShip = new DropShip();
		Marine marine = new Marine();
		
		SCV scv = new SCV();
		
		marine.specialAttack(dropShip);	
		marine.attack(dropShip);
		marine.attack(tank, 15);
		
		
		scv.repair(tank);
//		scv.repair(marine);
		scv.repair(dropShip);
		
	}
}