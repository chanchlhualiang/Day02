import java.util.ArrayList;

// 扩展,普通for循环遍历的过程中删除元素两种方案
public class demoArrayList05 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList();
        al.add("c");     //注意添加元素时空格的问题,因为在字符串中有空格的话,相当改变字符串的内容了,
                         // 如"i"和"i "的内容是不一样的
        al.add("h");
        al.add("l");
        al.add("i");
        al.add("i");
        al.add("k");
        System.out.println(al.size());
        System.out.println("删除前:" + al);


        for (int i = al.size() - 1; i >= 0; i--) {
            //System.out.println(al.get(i));
            if ("i".equals(al.get(i))) {
                al.remove(i);
            }
        }


        for (int j = 0; j < al.size(); j++) {
            System.out.println(al.get(j));
        }
    }
}
