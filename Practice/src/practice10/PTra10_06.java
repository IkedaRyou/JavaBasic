package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {
		Car car = new Car();
		car.serialNo = 9000;
		car.color = "Blue";
		car.gasoline = 45;
		final int distance = 240;
		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		int sum = 0;
		int count = 0;
		while (true) {
			int run = car.run();
			count++;
			sum += run;

			System.out.println(sum);

			if (run == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}

			if (sum >= distance) {
				System.out.println("目的地にまで" + count + "時間かかりました。残りのガソリンは、" + car.gasoline + "リットルです");
				break;
			}
		}
	}
}
