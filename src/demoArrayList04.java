//定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，
// 使用@分隔每个元素。输出结果: {元素1@元素2@元素3@元素4}。

import java.util.ArrayList;//第一个:{元素1   最后一个元素:元素4}   其他元素:@元素n

public class demoArrayList04 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("元素1");
        al.add("元素2");
        al.add("元素3");
        for (int i = 0; i < al.size(); i++) {
            if (i == 0) {
                System.out.print("{" + al.get(0));
            } else if (i == al.size() - 1) {
                System.out.print(al.get(al.size() - 1) + "}");
            }else {
                System.out.print("@" + al.get(i));
            }

        }

    }
}
