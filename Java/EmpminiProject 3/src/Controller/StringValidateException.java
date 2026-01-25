package Controller;

public class StringValidateException extends Exception {
	public String getMessage() {
        return "Please enter the valide string only!";
    }
}
