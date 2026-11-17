import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {
    EmailValidator validator = new EmailValidator();

    @Test
    void validEmail() {
        assertTrue(validator.isValidEmail("user@example.com"));
    }
    @Test
    void invalidEmail() {
        assertFalse(validator.isValidEmail("userexample.com"));
    }
    @Test
    void nullEmail() {
        assertFalse(validator.isValidEmail(null));
    }
}