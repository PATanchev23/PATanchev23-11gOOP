package PersonPackage;

public class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;

        }

        void showInfo()
        {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }


    public static void main(String[] args) {

        Person person = new Person("Presko", 17);

        person.showInfo();
    }
}
