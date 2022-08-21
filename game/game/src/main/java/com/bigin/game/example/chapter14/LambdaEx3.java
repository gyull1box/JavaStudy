package com.bigin.game.example.chapter14;

@FunctionalInterface
interface MyFunctionLd3 {
	void myMethod();
}

class LambdaEx3 {
	public static void main(String args[]) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100); // 변경 가
	}
}

class Outer {
	int val = 10;

	class Inner {
		int val = 20;	// this.val 값 변경 가능
		void method(int i) {	// void method(final int i) {
			int val = 30;	// final int val = 30; 변경 가능
			//			i = 10;			// 에러. 상수의 값을 변경할 수 없음
			// java: local variables referenced from a lambda expression must be final or effectively final
			MyFunctionLd3 f = () -> { // (i) 에러 , 외부 지역 변수와 같은 이름의 매개변수는 허용X
				System.out.println("i				: " + i); // 100
				System.out.println("val				: " + val); // 30
				System.out.println("this.val		: " + this.val); // 20
				System.out.println("Outer.this.val	: " + Outer.this.val); // 10
			};
			
			f.myMethod();
		}
	}
}