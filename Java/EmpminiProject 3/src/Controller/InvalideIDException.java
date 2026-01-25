package Controller;
public class InvalideIDException extends Exception {
    @Override
    public String getMessage() {
        return "❌ Invalid ID! Only positive integers are allowed.";
    }
}