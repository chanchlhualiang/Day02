import java.util.ArrayList;

//扩展,集合去重,旧集合存了重复数据,通过新集合去除
public class demoArrayList06 {
    public static void main(String[] args) {
        //ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList();
        s1.add(1);
        s1.add(1);
        s1.add(2);
        s1.add(3);
        System.out.println(s1);
        System.out.println("==============");
        ArrayList<Integer> s2 = new ArrayList();
        for (int i = 0; i < s1.size(); i++) {
            int e = s1.get(i);
            //System.out.println(s1.get(i));
            if (!s2.contains(e)) {//true,新集合是否包含旧集合元素,就添加到新的集合,包含不添加,去重
                s2.add(e);
            }
        }

        //打印的得到新集合
        System.out.println(s2);
        System.out.println("=============");

        //遍历集合
        for (int i = 0; i < s2.size(); i++) {
            System.out.println(s2.get(i));
        }
    }

}
