package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
	System.out.println("");
	for (int j = 0; j < i; j++) {
		System.out.print("■");
	}
	for (int j2 = 1; j2 > i-4 ; j2--) {
		System.out.print("□");
	}
}
		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */

	}
}
