import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> family = new ArrayList<>();

        family.add(new Person("Lazar", "Glaushev", "children", "male"));
        family.add(new Person("Sultana", "Glausheva", "parent", "female"));
        family.add(new Person("Stoqn", "Glaushev", "parent", "male"));
        family.add(new Person("Katerina", "Glausheva", "children", "female"));
        family.add(new Person("Kocho", "Glaushev", "children", "male"));

        ArrayList<Person> parents = new ArrayList<>();
        ArrayList<Person> children = new ArrayList<>();

        for (int i = 0; i < family.size(); i++) {

            if (family.get(i).role.equals("parent")) {
                parents.add(family.get(i));
            }
            else if (family.get(i).role.equals("children")) {
                children.add(family.get(i));
            }
        }

        ArrayList<Person> boys = new ArrayList<>();
        ArrayList<Person> girls = new ArrayList<>();

        for (int i = 0; i < children.size(); i++) {

            if (children.get(i).gender.equals("male")) {
                boys.add(children.get(i));
            }
            else if (children.get(i).gender.equals("female")) {
                girls.add(children.get(i));
            }
        }

        System.out.println("Family:");
        System.out.println(family);

        System.out.println("Parents:");
        System.out.println(parents);

        System.out.println("Children:");
        System.out.println(children);

        System.out.println("Boys:");
        System.out.println(boys);

        System.out.println("Girls:");
        System.out.println(girls);
    }
}
