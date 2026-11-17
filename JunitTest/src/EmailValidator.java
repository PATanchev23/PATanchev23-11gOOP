public class EmailValidator {
    public boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}