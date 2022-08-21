package com.bigin.game.example.chapter13;

class ThreadEx2 {
	public static void main(String[] args) throws Exception {
		ThreadEx2_1 t1 = new ThreadEx2_1();
		t1.start();
	}
	/**
	 * java.lang.Exception
	 * 	at com.bigin.game.example.chapter13.ThreadEx2_1.throwException(ThreadEx2.java:17)
	 * 	at com.bigin.game.example.chapter13.ThreadEx2_1.run(ThreadEx2.java:12)
	 */
}

class ThreadEx2_1 extends Thread {
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}