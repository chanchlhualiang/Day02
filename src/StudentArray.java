class Student {//我写在跟测试类同一个文件里面所以去掉了public
    // Student这个类和StudentArray在同一个包中,所以不需要导包语句
    private String name;
    private int age;

    //下面这一波代码都可以通过idea的快捷键alt insert自动生成
    public Student() {//构造方法,构造对象,创建对象的时候调用使用,new
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {//getter
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {//setter
        this.age = age;
    }
}

public class StudentArray {
    public static void main(String[] args) {
        //创建学生数组,stu是学生数组名.
        Student[] stu = new Student[3];//Student类,类型,引用数据类型都是null3固定死了

        //创建学生对象
        Student s1 = new Student("曹操", 40);
        Student s2 = new Student("刘备", 35);
        Student s3 = new Student("孙权", 30);

        //把学生对象作为元素赋值给学生数组
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;

        //遍历学生数组
        for (int x = 0; x < stu.length; x++) {//x索引
            Student s = stu[x];//s = new Student("曹操",40);
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}