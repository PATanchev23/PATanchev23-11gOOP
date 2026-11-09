public class Animal {
    String name;
    String species;
    String sound;

    public Animal(String name, String species, String sound) {
        this.name = name;
        this.species = species;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + " says " + sound);
    }

    public String toString() {
        return "name: " + name + " species: " +  species;
    }
}
