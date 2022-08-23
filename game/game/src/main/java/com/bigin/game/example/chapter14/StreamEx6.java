package com.bigin.game.example.chapter14;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class StreamEx6 {
	public static void main(String[] args) {
		StudentLd6[] stuArr = {
			new StudentLd6("이자바", 3, 300),
			new StudentLd6("김자바", 1, 200),
			new StudentLd6("안자바", 2, 100),
			new StudentLd6("박자바", 2, 150),
			new StudentLd6("소자바", 1, 200),
			new StudentLd6("나자바", 3, 290),
			new StudentLd6("감자바", 3, 180)
		};
		
		List<String> names = Stream.of(stuArr).map(StudentLd6::getName).collect(Collectors.toList());
		System.out.println(names);
		
		StudentLd6[] stuArr2 = Stream.of(stuArr).toArray(StudentLd6[]::new);
		
		for (StudentLd6 s : stuArr2) {
			System.out.println(s);
		}
		
		Map<String, StudentLd6> stuMap = Stream.of(stuArr)
											.collect(Collectors.toMap(s -> s.getName(), p -> p));
											
		for (String name : stuMap.keySet()) {
			System.out.println(name + " - " + stuMap.get(name));
		}
		
		long count = Stream.of(stuArr).collect(counting());
		long totalScore = Stream.of(stuArr)
								.collect(summingInt(StudentLd6::getTotalScore));
		System.out.println("count = " + count);
		System.out.println("totalScore = " + totalScore);
		
		totalScore = Stream.of(stuArr)
						   .collect(reducing(0, StudentLd6::getTotalScore, Integer::sum));
		System.out.println("totalScore = " + totalScore);
		
		Optional<StudentLd6> topStudent = Stream.of(stuArr)
											 .collect(maxBy(Comparator.comparingInt(StudentLd6::getTotalScore)));
		System.out.println("topStudent = " + topStudent);
		
		IntSummaryStatistics stat = Stream.of(stuArr)
										  .collect(summarizingInt(StudentLd6::getTotalScore));
		System.out.println(stat);
		
		String stuNames = Stream.of(stuArr).map(StudentLd6::getName)
										   .collect(joining(",", "{", "}"));
		System.out.println(stuNames);
	}
}

class StudentLd6 implements Comparable<StudentLd6> {
	String name;
	int ban;
	int totalScore;
	
	StudentLd6(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
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