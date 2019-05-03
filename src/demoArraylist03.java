import java.util.ArrayList;
//自定义2个学生对象,添加到集合,并遍历
public class demoArraylist03 {
    public static void main(String[] args) {
        Student s1 = new Student("学生一",20);
        Student s2 = new Student("学生二",22);
        ArrayList<Student> al = new ArrayList();
        al.add(s1);
        al.add(s2);
        System.out.println(al);

        for (int i = 0; i < al.size(); i++) {
            Student s = al.get(i);
            System.out.println(s.getName() + ":" + s.getAge() + "岁");

        }
    }
}