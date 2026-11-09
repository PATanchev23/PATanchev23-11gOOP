package Package2;

public class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
