package test;

public class if_return {

    public static void main(String[] args) {
        test1("1");
        System.out.println("-------�����ķָ���--------------");
        test1("8");

    }

    public static void test1(String str) {
        if ("1".equals(str)) {
            System.out.println("����Ĳ�����1");
            return;
        }
        if ("2".equals(str)) {
            System.out.println("����Ĳ�����2");
            return;
        }
        if ("8".equals(str)) {
            System.out.println("����Ĳ�����8");
            return;
        }
        System.out.println("������Ĳ���123`````````");
        // ...�������д���������������Ĵ���

    }
}
