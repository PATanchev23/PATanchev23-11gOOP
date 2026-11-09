package ArrayListExercise;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jane");
        names.add("Julie");
        names.add("Alex");
        for(int i = 0;i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
/* Масив Array
Има фиксиран размер
String[]
int[]
array[0]
array[0] = value
Няма add()
Няма remove()
*/
