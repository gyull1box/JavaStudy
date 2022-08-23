package com.bigin.game.example.chapter14;

import java.util.*;
import java.util.stream.*;

class StreamEx3 {
	public static void main(String[] args) {
		StudentLd6[] stuArr = {
			new StudentLd6("이자바", 3, 300),
			new StudentLd6("김자바", 1, 200),
			new StudentLd6("안자바", 2, 100),
			new StudentLd6("박자바", 2, 150),
			new StudentLd6("소자바", 1, 200),
			new StudentLd6("나자바", 3, 290),
			new StudentLd6("김자바", 3, 180),
		};
		
		Stream<StudentLd6> stuStream = Stream.of(stuArr);
		
		stuStream.sorted(Comparator.comparing(StudentLd6::getBan)
				 .thenComparing(Comparator.naturalOrder()))
				 .forEach(System.out::println);
		
		stuStream = Stream.of(stuArr);
		IntStream stuScoreStream = stuStream.mapToInt(StudentLd6::getTotalScore);
		
		IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
		
		System.out.println("count = " + stat.getCount());
		System.out.println("sum = " + stat.getSum());
		System.out.printf("average = %.2f%n", stat.getAverage());
		System.out.println("min = " + stat.getMin());
		System.out.println("max = " + stat.getMax());
	}
}

class StudentLd3 implements Comparable<StudentLd6> {
	String name;
	int ban;
	int totalScore;
	
	StudentLd3(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
	}
	
	String getName() { return name; }
	int getBan() { return ban; }
	int getTotalScore() { return totalScore; }
	
	public int compareTo(StudentLd6 s) {
		return s.totalScore - this.totalScore;
	}
}