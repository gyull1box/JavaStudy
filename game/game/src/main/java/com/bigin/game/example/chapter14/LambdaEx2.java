package com.bigin.game.example.chapter14;

@FunctionalInterface
interface MyFunctionLd2 {
	void myMethod();	// public abstract void myMethod();
}

class LambdaEx2 {
	public static void main(String[] args) {
		MyFunctionLd2 f = () -> {};	// MyFunction f = (MyFunction) ( () -> {} );
		Object obj = (MyFunctionLd1) ( () -> {} );	// Objeact타입으로 형변환이 생략됨
		String str = ((Object)(MyFunctionLd1)( () -> {} )).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
//		System.out.println( () -> {} );	// 에러. 람다식은 Object타입으로 형변환이 안됨
		System.out.println((MyFunctionLd1)( () -> {} ));
//		System.out.println((MyFunction)( () -> {} ).toString());	// 에러
		System.out.println(((Object)(MyFunctionLd1)( () -> {} )).toString());
		//                   ---------------------- 얘를 먼저 함수형으로 벼ㅑㄴ환
		/**
		 * com.bigin.game.example.chapter14.LambdaEx2$$Lambda$16/0x0000000800c01bf8@34c45dca 객체 형식 번호$$람다$숫쟈
		 * com.bigin.game.example.chapter14.LambdaEx2$$Lambda$17/0x0000000800c021f8@52cc8049
		 * com.bigin.game.example.chapter14.LambdaEx2$$Lambda$18/0x0000000800c02410@12edcd21
		 * com.bigin.game.example.chapter14.LambdaEx2$$Lambda$19/0x0000000800c02628@27973e9b
		 * com.bigin.game.example.chapter14.LambdaEx2$$Lambda$20/0x0000000800c02840@7530d0a
		 */
	}
}