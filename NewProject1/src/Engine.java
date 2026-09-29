public class Engine {
    String type;
    int horsepower;

    Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    void showEngineInfo()
    {
        System.out.println("Engine Type: " + type);
        System.out.println("Engine Horsepower: " + horsepower);
    }

}