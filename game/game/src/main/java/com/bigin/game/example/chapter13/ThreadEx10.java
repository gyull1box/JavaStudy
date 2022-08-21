package com.bigin.game.example.chapter13;

class ThreadEx10 implements Runnable {
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadEx10());
		t.setDaemon(true); // 데몬쓰레드로 설정한다. 이 부분이 없으면 종료가 안됨, 반드시 start 앞에 선언
		// start 이후에 선언 시 illegalThreadStateException 발생
		t.start();
		
		for (int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.println(i);
			
			if (i == 5) autoSave = true;
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(3*1000);	// 3초마다
			} catch(InterruptedException e) {}
			// autoSave의 값이 true이면 autoSave()를 호출한다.
			if (autoSave) autoSave();
		}
	}
	
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}