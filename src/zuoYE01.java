import java.util.ArrayList;
import java.util.Random;

//1.分析以下需求，并用代码实现：
//	(1)生成10个1至100之间的随机整数，存入一个ArrayList集合
//	(2)然后遍历集合元素并输出
//	(3)如：15 18 20 40 46 60 65 70 75 91
public class zuoYE01 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(100) + 1;
            al.add(num);
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.println("第"+(i+1)+"个随机数时:"+al.get(i));

        }
    }
}
