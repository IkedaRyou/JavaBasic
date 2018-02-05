package practice16;

import java.sql.Date;
import java.text.SimpleDateFormat;

/*
 */
public class PTra16_01 {
	public static void main(String[] args) {
		Date date = new Date(0);
		SimpleDateFormat f = new SimpleDateFormat("YYYY年MM月DD日");
		String dateStr =f.format(date);
		System.out.println(dateStr );
		/*
		* ★ 現在時刻を「YYYY年MM月DD日」形式で出力してください
		*/
	}
}