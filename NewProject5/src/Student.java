public class Student {
        String name;
        static int counter = 0;

        Student(String name) {
            this.name = name;
            counter++;
        }
}
