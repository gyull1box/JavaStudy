package com.bigin.game.example.chapter12;

enum DirectionChapter12 { EAST, SOUTH, WEST, NORTH }

class EnumEx1 {
	public static void main(String[] args) {
//		DirectionChapter12 d1 = DirectionChapter12.EAST;
//		DirectionChapter12 d2 = DirectionChapter12.valueOf("WEST");
//		DirectionChapter12 d3 = Enum.valueOf(DirectionChapter12.class, "EAST");
//
//		System.out.println("d1 = " + d1);
//		System.out.println("d2 = " + d2);
//		System.out.println("d3 = " + d3);
//
//		System.out.println("d1==d2 ? " + (d1==d2));
//		System.out.println("d1==d3 ? " + (d1==d3));
//		System.out.println("d1.equals(d3) ? " + (d1.equals(d3)));
////		System.out.println("d1 > d3 ? " + (d1 > d3));	// 에러
//		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
//		System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));
//
//		switch(d1) {
//			case EAST:
//				System.out.println("The direction is EAST.");	break;
//			case SOUTH:
//				System.out.println("The direction is SOUTH.");	break;
//			case WEST:
//				System.out.println("The direction is WEST.");	break;
//			case NORTH:
//				System.out.println("The direction is NORTH.");	break;
//			default:
//				System.out.println("Invalid direction.");		break;
//		}
//
		DirectionChapter12[] dArr = DirectionChapter12.values();
		
		for(DirectionChapter12 d : dArr)
			System.out.printf("%s = %d%n", d.name(), d.ordinal());
	}
}