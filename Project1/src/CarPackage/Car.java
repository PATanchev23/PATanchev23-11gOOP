package CarPackage;

public class Car {
    String brand;
    String color;
    int year;

    Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    void showCar()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    void drive()
    {
        System.out.println(brand + " is driving");
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 2024);
        Car car2 = new Car("BMW", "Black", 2022);
        car1.drive();
        car1.showCar();
        car2.drive();
        car2.showCar();
    }

}
