package test;

public class if_return {

    public static void main(String[] args) {
        test1("1");
        System.out.println("-------华丽的分隔线--------------");
        test1("8");

    }

    public static void test1(String str) {
        if ("1".equals(str)) {
            System.out.println("输入的参数是1");
            return;
        }
        if ("2".equals(str)) {
            System.out.println("输入的参数是2");
            return;
        }
        if ("8".equals(str)) {
            System.out.println("输入的参数是8");
            return;
        }
        System.out.println("你输入的不是123`````````");
        // ...这里可以写不满足上述条件的处理

    }
}
