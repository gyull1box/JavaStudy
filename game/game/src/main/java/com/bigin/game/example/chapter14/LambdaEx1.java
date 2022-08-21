package com.bigin.game.example.chapter14;

@FunctionalInterface // 함수형 인터페이스 -> 컴파일러가 함수형 인터페이스에 대해 Valid를 check함
		// 추상 메서드만 정의되어 있어야함. static, default 메서드는 괜츈
interface MyFunctionLd1 {
	void run();	// public abstract void run();
}

class LambdaEx1 {
	static void execute(MyFunctionLd1 f) {	// 매개변수의 타입이 MyFunction인 메서드
		f.run();
	}

	static MyFunctionLd1 getMyFunction() {	// 반환타입이 MyFunction인 메서드
		MyFunctionLd1 f = () -> System.out.println("f3.run()");
		// f 라는 변수에 람다를 넣는데, MyFunctionLd1이 인터페이스라 OK.
		return f;
	}

	public static void main(String[] args) {
		MyFunctionLd1 f1 = () -> System.out.println("f1.run()"); // 인터페이스 f1에

		MyFunctionLd1 f2 = new MyFunctionLd1() {	// 익명클래스로 run()을 구현
			public void run() {	// public을 반드시 붙여야 함
				// 'run()' in 'Anonymous class derived from com.bigin.game.example.chapter14.MyFunctionLd1' clashes with 'run()'
				// in 'com.bigin.game.example.chapter14.MyFunctionLd1'; a
				// ttempting to assign weaker access privileges ('package-private'); was 'public'
				System.out.println("f2.run()");
			}
		};

		MyFunctionLd1 f3 = getMyFunction();

		f1.run();
		f2.run();
		f3.run();

		execute(f1); // execute( () -> System.out.println("f1.run()")); 참조 없이 이렇게 가능
		execute( () -> System.out.println("run()") );
	}
}