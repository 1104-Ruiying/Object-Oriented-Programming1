package model;

import javax.print.DocFlavor;
 import  model.Student;
public class Teacher {
    // 成员变量
    private String name;
    public Student[] array = new Student[2];

    // 成员方法
    public void addStudent(Student stu3){ System.out.println("添加学生"); }
    public void checkStudent(){
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1)+ "姓名:" + array[i].getName() +"年龄" + array[i].getAge() +"性别" +
                    array[i].getSex()+"/n");
        }
    }

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
