import java.util.ArrayList;
public class Test03 {
    public static void main(String[] args) {
        //遍历过程中删除元素,注意事项
        ArrayList<String> al = new ArrayList();
        al.add("陈");
        al.add("华");//1//b
        al.add("良");//2//c
        al.add("良");


        for (int i = al.size() - 1; i >= 0; i--) {//最大索引到0
            //String s = al.get(i);

            if ("良".equals(al.get(i))){
                al.remove(i);
            }
        }

        //遍历
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}