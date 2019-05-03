//2.分析以下需求，并用代码实现：
//	(1)定义ArrayList集合，存入多个字符串
//	(2)删除集合中字符串"def" (集合中某个元素含有字符串def,那么就删除此元素)
//	(3)然后遍历集合元素并输出

import java.util.ArrayList;

public class zuoYe02 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("abc");
        al.add("def");
        al.add("ghi");
        //System.out.println(al.size());

        for (int i = al.size() - 1; i >= 0; i--) {
            if (al.get(i).equals("def")) {
                al.remove(i);
            }

        }
        for (int i = 0; i < al.size() ; i++) {
            System.out.println(al.get(i));
        }
    }
}

