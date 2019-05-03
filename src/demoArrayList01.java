import java.util.ArrayList;
//集合的使用练习
public class demoArrayList01 {
    public static void main(String[] args) {
        ArrayList<Character> a1 = new ArrayList();//char类型,需要包装
        ArrayList<Integer> a2 = new ArrayList();//int类型,需要包装
        ArrayList<Double> a3 = new ArrayList();
        ArrayList<String> a4 = new ArrayList();
        ArrayList<Object> a5 = new ArrayList();//可以存任何数据类型.
        ArrayList<Object> a6 = new ArrayList();


        System.out.println(a1);//[]
        //集合添加元素的方法add***
        a1.add('c');
        a1.add('h');
        a1.add('l');
        System.out.println(a1);//[c, h, l]
        //基本数据类型中int和char类型比较特殊,其他的基本数据类型首字母大写即可.引用数据类型不需要处理

        a2.add(1);
        a2.add(8);
        System.out.println(a2);//[1, 8]

        a3.add(13.3);
        System.out.println(a3);//[13.3]

        a4.add("chl");
        System.out.println(a4);//[chl]

        a5.add(555555);
        a5.add('k');
        a5.add("chl");
        a5.add(5.3);
        System.out.println(a5);//[555555, k, chl, 5.3]


        //得到集合里的某一元素的方法get***
        System.out.println(a5.get(2));//chl

        //移除集合中的某一元素的方法
        a6.add(555);
        a6.add('k');
        a6.add("chl");
        a6.add(1.5);
        System.out.println(a6);//移除前:[555, k, chl, 1.5]
        a6.remove(0);
        System.out.println(a6);//移除后:[k, chl, 1.5]
    }
}
