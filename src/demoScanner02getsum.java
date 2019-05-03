import java.util.Scanner;

//键盘录入两个数据并求和
public class demoScanner02getsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println();//分界
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();
        System.out.println();//分界
        System.out.println("两数之和为:" + (num1 + num2));

    }
}
