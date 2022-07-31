package com.bigin.game.example.chapter12;

class NewClassChapter12 {
	int newField;
	
	int getNewField() { return newField; }
	
	@Deprecated
	int oldField;
	
	@Deprecated
	int getOldField() { return oldField; }
}

class AnnotationEx2 {
	public static void main(String args[]) {
		NewClassChapter12 nc = new NewClassChapter12();
		
		nc.oldField = 10;						// @Deprecated가 붙은 대상을 사용
		System.out.println(nc.getOldField());	// @Deprecated가 붙은 대상을 사용
	}
}