import javax.sound.midi.Soundbank;
import java.util.Scanner;

//键盘录入三个数据并获取最大值    方法一:采用if语句来判断
public class demoScanner03compare {
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

        int max1;
        int max;
        if (num1 < num2) {
            max1 = num2;
        } else {
            max1 = num1;
        }
        if (num3<max1){
            max = max1;
        }
            else {
            max = num3;
        }
        System.out.println("三个数的最大值是:" + max);
    }

}
