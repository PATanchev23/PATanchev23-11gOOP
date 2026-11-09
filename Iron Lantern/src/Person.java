public class Person {

    String name;
    String surname;
    String role;
    String gender;

    Person(String name, String surname, String role, String gender) {
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.gender = gender;
    }

    public String getInfo() {
        return name + " " + surname + " - " + role + ", " + gender;
    }

    public String toString() {
        return getInfo();
    }
}
