package com.bigin.game.example.chapter14;

import java.util.function.*;

class LambdaEx7 {
	public static void main(String[] args) {
		Function<String, Integer>	f1		= (s) -> Integer.parseInt(s, 16);
		Function<Integer, String>	g1		= (i) -> Integer.toBinaryString(i);
		
		Function<String, String>	h1		= f1.andThen(g1);
		Function<Integer, Integer>	h2		= f1.compose(g1);
		
		System.out.println(h1.apply("FF"));
		System.out.println(h2.apply(2));
		
		
		Function<String, String>	f2		= x -> x;
		System.out.println(f2.apply("AAA"));
		
		Predicate<Integer>			p1		= i -> i < 100;
		Predicate<Integer>			q1		= i -> i < 200;
		Predicate<Integer>			r1		= i -> i % 2 == 0;
		Predicate<Integer>			notP1	= p1.negate();
		
		Predicate<Integer>		  all		= notP1.and(q1.or(r1));
		System.out.println(all.test(150));
		
		String str1	= "abc";
		String str2 = "abc";

		Predicate<String>			p2		= Predicate.isEqual(str1);
		
		boolean result = p2.test(str2);
		System.out.println(result);
	}
}