public class Main
{
    public static void main(String[] args)
    {
        Animal animal1 = new Animal("Kangaroo", "mammal", "Chortle");
        Animal animal2 = new Animal("Dolphin", "mammal", "Click ");
        Animal animal3 = new Animal("Bird", "egg-laying", "Squeak ");

        Zoo zoo = new Zoo();

        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        zoo.addAnimal(animal3);

        zoo.displayAnimals();
    }
}