package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Splitest {
	static String a = "a<yzh>Ӧ�ٻ�s^df||ert|*w/we.qwe.||wer.por*|poy+ou^y+123";
	public static void main(String[] args) {
		
		//test("\\*");                //         *
		//test("\\.");                  //       .
		//test("\\+");                    //     +
		//test("\\^");                //         ^
		//test("\\|");             //            |   ����Ҫת��
		//test("\\+|\\*");      //        ��+���롮*���ָ�
		//test("/");              //      ��/������ת�壬��\�������ܴ������ַ���
		//test("\\|\\|");           //    ˫||�ָ��
		split();
	}

	public static void test(String s) {

		String[] b = a.split(s);
		for (String c : b) {
			System.out.println(c);
		}
	}
	
	public static void split() { 

       String c = "123<yzh><zrg>Ӧ����90";
       
       Pattern p = Pattern.compile("<(.+?)>");
       Matcher m = p.matcher(c);
        while(m.find()) {
               System.out.println(m.group(0));//m.group(1)�������������ַ�
               System.out.println(m.group(1));
      
     }
       
       System.out.println(c.matches("<(.+?)>/g"));
       
      
       System.out.println(c.replaceAll("<(.+?)>",""));
	}
}
