package test;

public class StringEndWith {

	public static void main(String args[]) {

		String Str = new String("This is really not immutable!!");

		boolean flag1 = Str.endsWith("");

		System.out.println("flag = " + flag1);

		boolean flag2 = Str.endsWith("immutable!!");

		System.out.println("flag = " + flag2);

		boolean flag3 = Str.endsWith("immutable");

		System.out.println("flag = " + flag3);

		boolean flag4 = Str.startsWith("This");

		System.out.println("flag = " + flag4);

	}

}
