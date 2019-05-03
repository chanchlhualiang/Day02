import java.util.Scanner;//这里idea自动生成导包

//Scanner的定义格式使用练习
public class demoScanner01 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner sc1 = new Scanner(System.in); //Scanner  是类
        int i1 = sc1.nextInt();//nextInt() 是一种方法,有java设计者编写,使用调用即可使用
        System.out.println("输入的整数是:" + i1);
        System.out.println("===========分界==============");
        //情况一
        System.out.println("请输入一行字");
        String i2 = sc1.next();
        System.out.println("输入的内容一是:" + i2);
        System.out.println("============分界=============");

        //情况二
        System.out.println("请输入一行字");
        String i3 = sc1.nextLine();
        System.out.println("输入的内容二是:" + i3);//在windows系统中enter键有换行的作用,这里要是使用nextLine()的话可以新建新的类来使用.
        System.out.println("=============分界============");

        //使用  nextLine()  的情况
        System.out.println("请输入一行字");
        Scanner sc2 = new Scanner(System.in);
        String i4 = sc2.nextLine();
        System.out.println("输入的内容三是:" + i4);


    }
}
