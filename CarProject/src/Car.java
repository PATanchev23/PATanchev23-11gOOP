public class Car {
    private String carName;
    private String carModel;
    private String carCapacity;

    public Car(String carName, String carModel, String carCapacity) {
        this.carName = carName;
        this.carModel = carModel;
        this.carCapacity = carCapacity;
    }

    public String getDetails() {
        return carName + " , " + carModel + " , " + carCapacity;
    }
}
