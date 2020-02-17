
import model.Student;
import model.Teacher;

public class Application {

    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.setName("李莉");
        stu1.setAge(20);
        stu1.setSex("女");
        System.out.println("姓名" + stu1.getName());
        System.out.println("年龄" + stu1.getAge());
        System.out.println("性别" + stu1.getSex());
        stu1.eat();
        stu1.rest();
        System.out.println("============================");

        Teacher tea = new Teacher();
        tea.setName("张龙");
        System.out.println("教师姓名:" + tea.getName());
        tea.array[0] = new Student("李莉", 20, "女");
        tea.array[1] = new Student("王其", 19, "男");

        Student stu3 = new Student("赵毅", 22, "男");

        tea.addStudent(stu3);

        System.out.println("当前管理的学生为：");
        tea.checkStudent();
    }
}
