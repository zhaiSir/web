package test;

public class Sqlin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayToSqlIn();
	}

	public static void arrayToSqlIn() { // 将数组放入sql语句的in条件中
		String str = "tt,oo,pp"; // 原始字符串
		String[] strArr = str.split(","); // 将字符串中的","除去后存入数组里
		String endstr = "";

		for (String a : strArr) {
			endstr += "'" + a + "',";
		}
		endstr = endstr.substring(0, endstr.length() - 1);         //去掉最后一个逗号（，）
		String sqlstr = "select * from tablename where xxx in(" + endstr + ")";
		System.out.println(sqlstr);
	}

}
