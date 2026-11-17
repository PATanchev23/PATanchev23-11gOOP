import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void countIncreasesWhenStudentIsAdded() {
        StudentService service = new StudentService();
        assertEquals(0, service.getStudentsCount());
        service.addStudent("Ivan");
        assertEquals(1, service.getStudentsCount());
        service.addStudent("Maria");
        assertEquals(2, service.getStudentsCount());
    }

    @Test
    void nullAndEmptyNamesAreNotAdded() {
        StudentService service = new StudentService();
        service.addStudent(null);
        service.addStudent("");
        assertEquals(0, service.getStudentsCount());
    }
}