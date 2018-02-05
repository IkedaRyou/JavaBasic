/*
 * PTra16_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_03 {
	public PTra16_03(String string) {
	}

	@Override
	public String toString() {
		return super.toString();

	}

	/*
	 * toStringメソッドをオーバーライドしてください
	 *
	 * 処理内容
	 * 	・親クラス（Objectクラス）のtoStringの処理を行ってください
	 *	・その後、改行をして「PTra16_03#toString()の処理」という文字列を連結してください
	 */
	public class Object {
	}

	public static void main(String[] args) {
		PTra16_03 r = new PTra16_03("PTra16_03#toString()の処理");
		System.out.println(r);
		// ★ PTra16_03クラスのtoStringメソッドの内容を出力してください

	}
}
