import java.util.Scanner;

//匿名对象 (使用练习)：没有变量名(名字)的对象。
//匿名对象可以作为方法的参数和返回值
public class demoAnonymous01 {
    public static void main(String[] args) {
        new Scanner(System.in);
        getScanner();

        Scanner s = getScanner();
        System.out.println(s);
//        Scanner num = new Scanner(System.in);
//        System.out.println(num);
    }

    public static Scanner getScanner() {
        System.out.println("请输入一个整数");
        int i = new Scanner(System.in).nextInt();
        System.out.println("输入的数字是:" + i);

        return new Scanner(System.in);


    }
}
