package ExceptionAssignment;
import java.util.Scanner;

//Custom Exception for Invalid Username
class InvalidUsernameException extends Exception {
 public InvalidUsernameException(String message) {
     super(message);
 }
}

//Custom Exception for Invalid Password
class InvalidPasswordException extends Exception {
 public InvalidPasswordException(String message) {
     super(message);
 }
}

//Login class
class Login {
 private String username = "admin";
 private String password = "12345";

 public void validateUsername(String enteredUsername) throws InvalidUsernameException {
     if (!enteredUsername.equals(username)) {
         throw new InvalidUsernameException("Invalid Username!");
     }
 }

 public void validatePassword(String enteredPassword) throws InvalidPasswordException {
     if (!enteredPassword.equals(password)) {
         throw new InvalidPasswordException("Incorrect Password!");
     }
 }
}

//Main class
 class LoginSystem {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Login login = new Login();

     try {
         // Step 1: Username Validation
         System.out.print("Enter Username: ");
         String uname = sc.nextLine();

         login.validateUsername(uname);  // may throw exception

         // Step 2: Password Validation (Max 3 attempts)
         int attempts = 3;

         while (attempts > 0) {
             System.out.print("Enter Password: ");
             String pass = sc.nextLine();

             try {
                 login.validatePassword(pass);  // may throw exception
                 System.out.println("Login Successful!");
                 return; // exit program after success

             } catch (InvalidPasswordException e) {
                 attempts--;
                 if (attempts > 0) {
                     System.out.println(e.getMessage() + " Attempts left: " + attempts);
                 } else {
                     System.out.println("Account Locked!");
                 }
             }
         }

     } catch (InvalidUsernameException e) {
         System.out.println(e.getMessage());
     }
     sc.close();
 }
}