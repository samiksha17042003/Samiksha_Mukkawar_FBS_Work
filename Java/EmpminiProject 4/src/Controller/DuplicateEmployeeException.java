package Controller;

public class DuplicateEmployeeException extends Exception {
	public String getMessage() {
        return "Employee with this ID already exists!";
    }
}
