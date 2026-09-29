public class Main {
    public static void main(String[] args) {

        Department department = new Department("IT", "Burgas");
        Employee employee = new Employee("Ivan", 2500,department);

        employee.showInfo();
    }
}