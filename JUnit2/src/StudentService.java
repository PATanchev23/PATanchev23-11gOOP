import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<String> students = new ArrayList<>();

    public void addStudent(String name) {
        if (name != null && !name.isEmpty()) {
            students.add(name);
        }
    }

    public int getStudentsCount() {
        return students.size();
    }
}