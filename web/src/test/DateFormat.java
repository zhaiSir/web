package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");  //("yyyyÄêMMÔÂddÈÕ")
		String now = sdf.format(new Date());
		System.out.println(now);
	}

}
