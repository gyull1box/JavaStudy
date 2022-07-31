package com.bigin.game.example.chapter12;

import java.util.ArrayList;

class NewClass {
	int newField;

	int getNewField() {
		return newField;
	}
	
	@Deprecated
	int oldField;
	
	@Deprecated
	int getOldField() {
		return oldField;
	}
}

class AnnotationEx3 {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		NewClassChapter12 nc = new NewClassChapter12();
		
		nc.oldField = 10;
		System.out.println(nc.getOldField());
		
		@SuppressWarnings("unchecked")				// 지네릭스 관련 경고를 억제
		ArrayList<NewClassChapter12> list = new ArrayList();
		list.add(nc);
	}
}