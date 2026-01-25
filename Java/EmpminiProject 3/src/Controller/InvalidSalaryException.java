package Controller;

public class InvalidSalaryException extends Exception {
    public String getMessage() {
        return "Salary cannot be negative!";
    }
}
