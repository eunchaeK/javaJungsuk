package ch12.exercise;

enum Direction{EAST, SOUTH, WEST, NORTH}

public class EnumEx1 {
	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		
		System.out.println("d1==d2 ? " + (d1==d2));
		System.out.println("d1==d3 ? " + (d1==d3));
		System.out.println("d1.equals(d3) ? " + d1.equals(d3));
//		System.out.println("d2 > d3 ? " + (d2 > d3)); 	// 에러
		System.out.println("d1.compareTo(d3) ? "+ d1.compareTo(d3));
		System.out.println("d1.compareTo(d2) ? "+ d1.compareTo(d2));
		
		switch (d1) {
			case EAST:	// Direction.EAST라고 쓸 수 없음.
				System.out.println("The Direction is EAST.");
				break;
			case SOUTH:	// Direction.EAST라고 쓸 수 없음.
				System.out.println("The Direction is SOUTH.");
				break;
			case WEST:	// Direction.EAST라고 쓸 수 없음.
				System.out.println("The Direction is WEST.");
				break;
			case NORTH:	// Direction.EAST라고 쓸 수 없음.
				System.out.println("The Direction is NORTH.");
				break;
			default:
				System.out.println("Invalid directoin.");
				break;
		}
		
		Direction[] dArr = Direction.values();
		for(Direction d : dArr)
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
	}
}
