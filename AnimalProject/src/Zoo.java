import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Zoo {
     List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void displayAnimals()
    {
        for(Animal animal: animals)
        {
            System.out.println(animal.toString());
            animal.makeSound();
        }
    }
}
