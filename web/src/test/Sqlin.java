package test;

public class Sqlin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayToSqlIn();
	}

	public static void arrayToSqlIn() { // ���������sql����in������
		String str = "tt,oo,pp"; // ԭʼ�ַ���
		String[] strArr = str.split(","); // ���ַ����е�","��ȥ�����������
		String endstr = "";

		for (String a : strArr) {
			endstr += "'" + a + "',";
		}
		endstr = endstr.substring(0, endstr.length() - 1);         //ȥ�����һ�����ţ�����
		String sqlstr = "select * from tablename where xxx in(" + endstr + ")";
		System.out.println(sqlstr);
	}

}
