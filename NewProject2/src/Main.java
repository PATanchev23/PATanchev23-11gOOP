public class Main {
    public static void main(String[] args) {
        Address address = new Address("Burgas", "Aleksandrovska",10);
        Person person = new Person("Maria",25, address);

        person.showInfo();
    }
}
