import java.util.Scanner;

public class demoScanner04conpare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println();//分界

        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();
        System.out.println();

        System.out.println("请输入第三个数字");
        int num3 = sc.nextInt();
        System.out.println();

        //int max1;
        int max1 = num1>num2?num1:num2;
        int max = max1>num3?max1:num3;
        System.out.println("三个数的最大值是:" + max);

    }
}
