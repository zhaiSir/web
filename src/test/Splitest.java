package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Splitest {
	static String a = "a<yzh>应召回s^df||ert|*w/we.qwe.||wer.por*|poy+ou^y+123";
	public static void main(String[] args) {
		
		//test("\\*");                //         *
		//test("\\.");                  //       .
		//test("\\+");                    //     +
		//test("\\^");                //         ^
		//test("\\|");             //            |   都需要转义
		//test("\\+|\\*");      //        ‘+’与‘*’分割
		//test("/");              //      ‘/’不用转义，‘\’不可能存在于字符串
		//test("\\|\\|");           //    双||分割方法
		split();
	}

	public static void test(String s) {

		String[] b = a.split(s);
		for (String c : b) {
			System.out.println(c);
		}
	}
	
	public static void split() { 

       String c = "123<yzh><zrg>应朝晖90";
       
       Pattern p = Pattern.compile("<(.+?)>");
       Matcher m = p.matcher(c);
        while(m.find()) {
               System.out.println(m.group(0));//m.group(1)不包括这两个字符
               System.out.println(m.group(1));
      
     }
       
       System.out.println(c.matches("<(.+?)>/g"));
       
      
       System.out.println(c.replaceAll("<(.+?)>",""));
	}
}
