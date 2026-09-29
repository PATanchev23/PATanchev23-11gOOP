public class Car {
    String brand;
    String model;
    Engine engine;

    Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    void showCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        engine.showEngineInfo();
    }

    public static void main(String[] args) {
        Engine engine = new Engine("Petrol", 150);

        Car car1 = new Car("Toyota", "Corolla", engine);

        car1.showCarInfo();
    }
}
