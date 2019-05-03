import java.util.Random;

////随机数   Random类的使用练习(有边界的随机数遍历).
public class demoRandom02 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i1=1;i1<=100;i1++){
            int i = r.nextInt(100) + 1;
            System.out.println("第"+i1+"个"+"随机数是:"+i);
        }

    }
}
