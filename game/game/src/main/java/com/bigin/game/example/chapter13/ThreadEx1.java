package com.bigin.game.example.chapter13;

class ThreadEx1 {
	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1(); // Thread의 자손 클래스의 인스턴스 생성
		// Runnable r = new ThreadEx1_2(); // Runnable 자손 클래스 생성
		// Thread t2 = new Thread(r); // 생성자 Thread(Runnable target)
		Thread t2 = new Thread(new ThreadEx1_2()); // 위 r + t2 한 줄로

		t1.start();
		t2.start();
	}
}

class ThreadEx1_1 extends Thread {
	public void run() { 
		for (int i=0; i<5; i++) { // run() 오버라이드: 작업 내용 구현
			// 조상인 Thread의 메서드 바로 사용 가능 
			System.out.println(getName()); //Thread-0
		}
	}
	/**
	 * Allocates a new {@code Thread} object. This constructor has the same
	 * effect as {@linkplain #Thread(ThreadGroup,Runnable,String) Thread}
	 * {@code (null, null, gname)}, where {@code gname} is a newly generated
	 * name. Automatically generated names are of the form
	 * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
	 */
}

class ThreadEx1_2 implements Runnable {
	public void run() {
		for (int i=0; i<5; i++) {
//			Thread.currentThread(); //현재 실행 중인 Thread 반환
			// 조상인 Thread가 없어 실행중인 쓰레드를 호출 후 내부 메소드 사용
			System.out.println(Thread.currentThread().getName()); // Thread-1
		}
	}
}