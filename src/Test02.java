import java.util.Scanner;
//求三个数值的和     求三个数据的最大值
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数字");
        int i = sc.nextInt();
        System.out.println("输入第二个数字");
        int i1 = sc.nextInt();
        System.out.println("输入第三个数字");
        int i2 = sc.nextInt();
        System.out.println("三个数值的和:"+(i + i1+i2));
        int max1 = i>i1?i:i1;
        int max2 = max1>i2?max1:i2;
        System.out.println("最大值:" + max2);
    }
}
