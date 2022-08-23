package com.bigin.game.example.chapter14;

import java.io.*;
import java.util.stream.*;

class StreamEx2 {
	public static void main(String[] args) {
		File[] fileArr = {
							new File("Ex1.java"),
							new File("Ex1.bak"),
							new File("Ex2.java"),
							new File("Ex1"),
							new File("Ex1.txt")
		};
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println);
		
		fileStream = Stream.of(fileArr);
		
		fileStream.map(File::getName)
				  .filter(s -> s.indexOf('.') != -1) // 확장자가 없는 것은 제외
				  .map(s -> s.substring(s.indexOf('.') + 1))	// 확장자만 추출
				  .map(String::toUpperCase)
				  .distinct()
				  .forEach(System.out::print); // JAVABAKTXT
		
		System.out.println();
	}
}