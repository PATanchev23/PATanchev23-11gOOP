public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan");
        Student student2 = new Student("Petar");
        student1.name = "Maria";
        student2.name = "Ivan";

        System.out.println(Student.counter);
    }
}