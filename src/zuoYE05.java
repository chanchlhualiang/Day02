import java.util.Random;
import java.util.Scanner;

//5.【代码题必做】
//系统产生一个50-60之间的随机数，请猜出这个数字是多少。（猜中之后程序就结束，没有猜中则继续猜）
//详细步骤：
//①、利用Random产生一个随机数，范围50-60（包括50和60）。
//②、键盘录入我们要猜的数字
//③、比较这两个数字(用if语句)
//        大了：给出提示大了，并且继续猜
//        小了：给出提示小了，并且继续猜
//        猜中了：给出提示，恭喜你，猜中了，并且结束循环
public class zuoYE05 {
    public static void main(String[] args) {
        Random r = new Random();
        int gameNum = r.nextInt(11) + 50;
        System.out.println("请输入你猜的数字,你有十次机会!");
        System.out.println();
        System.out.println("第1次机会:");
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            int guessNum = sc.nextInt();
            if (guessNum < gameNum) {
                System.out.println("你猜的数字" + guessNum + "小了,请继续猜");
                System.out.println("第" + (i + 2) + "机会:");
                System.out.println();

            } else if (guessNum > gameNum) {
                System.out.println("你猜的数字" + guessNum + "大了,请继续猜");
                System.out.println();
                System.out.println("第" + (i + 2) + "机会:");

            } else {
                System.out.println("恭喜你!你猜的数字" + guessNum + "正确");
                break;

            }

        }


    }

}
