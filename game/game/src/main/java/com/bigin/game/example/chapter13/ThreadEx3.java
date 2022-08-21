package com.bigin.game.example.chapter13;

class ThreadEx3 {
	public static void main(String args[]) throws Exception {
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run(); // main ?? - start - run- throwEx~
	}
}

class ThreadEx3_1 extends Thread {
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}