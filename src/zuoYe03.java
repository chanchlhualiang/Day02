import java.util.ArrayList;

//3.分析以下需求，并用代码实现：
//	(1),定义一个Worker类型(属性私有、空参有参构造、set、get方法).
//   三个属性：姓名(String name)、年龄(int age)、工资(double salary),
// 	 行为:在Worker类中定义work方法打印一句话，如：凤姐 18 2000
//(2)定义ArrayList集合，在ArrayList集合中增加三个员工，基本信息如下：
//        "凤姐",18,20000
//        "欧阳峰", 60, 8000
//        "刘德华", 40, 90000
//        "刘德华", 41, 50000
//        "刘德华", 30, 60000
//(3)删除所有姓名是"刘德华"的信息
//(4)利用for 循环遍历，对ArrayList中所有的员工调用work 方法,显示所有信息.
public class zuoYe03 {
    public static void main(String[] args) {
        Worker w = new Worker("凤姐", 18, 2000);
        w.work();
        //new Worker("凤姐", 18, 2000).work();
        ArrayList<Worker> al = new ArrayList();

        Worker w1 = new Worker("欧阳峰", 60, 8000);
        Worker w2 = new Worker("刘德华", 40, 90000);
        Worker w3 = new Worker("刘德华", 40, 90000);
        Worker w4 = new Worker("刘德华", 40, 90000);

        al.add(w);
        al.add(w1);
        al.add(w2);
        al.add(w);
        al.add(w3);
        al.add(w4);
        w1.work();
        w2.work();
        w3.work();
        w4.work();



    }
}

class Worker {
    private String name;
    private int age;
    private double salary;

    public void work() {
        System.out.println(name + ":  " + age + "岁,  " + salary + "元");

    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}