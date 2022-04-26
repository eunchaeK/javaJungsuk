package ch07.practice;

public class Exercise7_17 {
	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank(3, 4);
		Dropship d = new Dropship(10, 10);
		
		m.move(4, 5);
		m.stop();
		m.stimPack();
		
		System.out.println();
		
		t.move(9, 2);
		t.stop();
		t.changeMode();
		
		System.out.println();
		
		d.move(10, 10);
		d.stop();
		d.load();
		d.unload();
		
	}// end main()
}

abstract class Unit {
	int x, y;	// 현재 위치 
	
	Unit(){this(0,0);}
	Unit(int x, int y){this.x=x; this.y=y;}
	
	abstract void move(int x, int y);
	void stop() {
		/* 현재 위치에 정지 */
		System.out.println("Unit stop");
	}
}

class Marine extends Unit{ // 보병
	Marine(){super();}
	Marine(int x, int y){super(x,y);}
	void stimPack() { 
		/*스팀팩을 사용한다.*/
		System.out.println("use stimPack...");
	}
	
	@Override
	void move(int x, int y) {
		System.out.println("Marine move");
	} 
}

class Tank extends Unit { // 탱크
	Tank(){super();}
	Tank(int x, int y){super(x,y);}
	void changeMode() { 
		/* 공격모드를 변환한다. */
		System.out.println("change attackMode");
	}
	@Override
	void move(int x, int y) {
		System.out.println("Tank move");
	} 
}

class Dropship extends Unit{ // 수송선
	Dropship(){super();}
	Dropship(int x, int y){super(x,y);}
	void load() { 
		/* 선택된 대상을 태운다 .*/ 
		System.out.println("Dropship.load");
	} 
	void unload() { 
		/* 선택된 대상을 내린다 .*/ 
		System.out.println("Dropship.unload");
	}
	
	@Override
	void move(int x, int y) {
		System.out.println("Dropship move");
	} 
}
