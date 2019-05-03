import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//6.【代码题必做】
//有一个已经排好序的列表[1, 8, 26, 45, 60, 78, 99], 
// 现在输入一个0-100之间（范围无需代码判断）的数字, 将该数字按从小到大顺序插入该列表。
// (如输入数字50, 那么这个列表的结果为：[1, 8, 26, 45, 50, 60, 78, 99]。)请在控制台中打印插入前和插入后的数组。
public class zuoYe06 {
    public static void main(String[] args) {
        int[] array = {1, 8, 26, 45, 60, 78, 99};//给定数值
        ArrayList<Integer> al = new ArrayList();
        for (int i = 0; i < array.length; i++) {//遍历数组并将数组元素添加到集合中
            //System.out.println(sz[i]);
            al.add(array[i]);
        }
        System.out.println("插入前:" + al);
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("请输入数字(1~100):");
        Scanner sc = new Scanner(System.in);//接收来自键盘输入的数字
        int num = sc.nextInt();
        al.add(num);//将键盘输入的数字添加到集合中
        System.out.println("插入后:"+al);
        int[] newArray = new int[al.size()];//新建一个新数组来接收来自 插入数字后集合的元素.
        for (int i = 0; i < al.size(); i++) {
            al.get(i);//添加输入新数字到集合中
            newArray[i] = al.get(i);//将添加新数字后的集合的元素放入新数字中
            //System.out.print(newArray[i]+",");

        }
        Arrays.sort(newArray);//将数组中的元素从小到大排序
        System.out.println("插入后排序:"+Arrays.toString(newArray));
    }
}
