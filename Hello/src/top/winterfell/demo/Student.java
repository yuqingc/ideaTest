package top.winterfell.demo;

public class Student extends Person {
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int age, String name) {
        super(age, name);
    }

    public Student() {
    }
}
