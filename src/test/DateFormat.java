package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");  //("yyyy��MM��dd��")
		String now = sdf.format(new Date());
		System.out.println(now);
	}

}
