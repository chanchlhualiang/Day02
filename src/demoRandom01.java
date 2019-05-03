import java.util.Random;

//随机数Random的使用练习(无边界).
public class demoRandom01 {
    public static void main(String[] args) {
        Random r = new Random();
        //不用定义变量来随机数打印
        r.nextInt();//调用nextInt方法,可定义变量接收或者不用随机数
        System.out.println(r.nextInt());

        //定义变量来接收随机数
        int i = r.nextInt();
        System.out.println(i);
    }
}
