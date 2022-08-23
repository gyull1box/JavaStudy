package com.bigin.game.example.chapter14;

import java.util.*;
import java.util.stream.*;

class StreamEx1 {
	public static void main(String[] args) {
		Stream<StudentLd6> studentStream = Stream.of(
													new StudentLd6("이자바", 3, 300),
													new StudentLd6("김자바", 1, 200),
													new StudentLd6("안자바", 2, 100),
													new StudentLd6("박자바", 2, 150),
													new StudentLd6("소자바", 1, 200),
													new StudentLd6("나자바", 3, 290),
													new StudentLd6("감자바", 3, 180)
												);
					
		studentStream.sorted(Comparator.comparing(StudentLd6::getBan)
									   .thenComparing(Comparator.naturalOrder()))
									   .forEach(System.out::println);
	}
}

class StudentLd1 implements Comparable<StudentLd6> {
	String name;
	int ban;
	int totalScore;
	
	StudentLd1(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}
	
	String getName() {
		return name;
	}
	
	int getBan() {
		return ban;
	}
	
	int getTotalScore() {
		return totalScore;
	}
	
	public int compareTo(StudentLd6 s) {
		return s.totalScore - this.totalScore;
	}
}