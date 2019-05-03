import java.util.Random;
import java.util.Scanner;

//猜数字小游戏(猜出1~100之间随机产生的一个随机数字,有10次机会)
public class demoRandom03guessGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int correctNum = r.nextInt(100)+1;
        //System.out.println(correctNum);
        System.out.println("游戏开始!(猜测1~100之间的一个正确数字),你有十次机会!");
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println("第"+i+"机会!"+"请输入你猜测的数字:");
            int guessNum = s.nextInt();
            System.out.println("输入的数字是:" + guessNum);
            if (correctNum < guessNum) {
                System.out.println("你输入的数字" + guessNum + "大了!请重新输入");
                System.out.println();

            } else if (correctNum > guessNum) {
                System.out.println("你输入的数字" + guessNum + "小了!请重新输入");
                System.out.println();

            } else {
                System.out.println("你输入的数字" + guessNum + "正确!恭喜恭喜!!!");
                break;
            }
        }
    }
}
