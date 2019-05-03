import java.util.ArrayList;
import java.util.Random;

//生成6个1~33之间的随机整数,添加到集合,并遍历
public class demoArrayList02 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        for (int i = 0; i < 6; i++) {
            Random r = new Random();
            int num = r.nextInt(33) + 1;
            //System.out.println(num);
            al.add(num);//将所得随机数添加到集合
        }

        System.out.println(al);//打印所得的集合

        for (int i = 0; i < al.size(); i++) {//所得集合的遍历
            System.out.println(al.get(i));
        }
    }
}
