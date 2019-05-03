import java.util.Random;
import java.util.Scanner;
//有三次机会输入猜测的数字,若是三次都没有才对,游戏结束!
public class Test01 {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        for (int i = 1;i<=10;i++) {
            System.out.println("请输入猜测的数字:");
            int num2 = sc.nextInt();
            if (num2 > num1) {
                System.out.println("输入的数字过大,请重新输入!");
                System.out.println();
            } else if (num2 < num1) {
                System.out.println("输入的数字过小,请重新输入!");
                System.out.println();
            } else {
                System.out.println("猜对啦!");
                break;
            }

        }
        System.out.println("游戏结束!");
    }

}
