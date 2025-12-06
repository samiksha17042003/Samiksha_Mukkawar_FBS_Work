package ExceptionAssignment;
import java.util.*;

//---------------- Custom Exceptions ----------------
class InvalidMovieSelectionException extends Exception {
 public InvalidMovieSelectionException(String msg) {
     super(msg);
 }
}

class InvalidTicketNumberException extends Exception {
 public InvalidTicketNumberException(String msg) {
     super(msg);
 }
}

class TicketsSoldOutException extends Exception {
 public TicketsSoldOutException(String msg) {
     super(msg);
 }
}

//---------------- MovieBooking Class ----------------
class MovieBooking {

 static int ticketPrice = 200;
 static int maxAvailableTickets = 50;

 static String[] movies = {
         "3 Idiots", "Dangal", "Bahubali 2: The Conclusion",
         "Kabir Singh", "Chhichhore", "Zindagi Na Milegi Dobara",
         "Tanhaji", "Uri: The Surgical Strike", "War",
         "Bajrangi Bhaijaan"
 };

 public static int getRemainingTickets() {
     return maxAvailableTickets;
 }

 public static void bookTickets(int movieNumber, int tickets)
         throws InvalidMovieSelectionException,
         InvalidTicketNumberException,
         TicketsSoldOutException {

     if (movieNumber < 1 || movieNumber > movies.length) {
         throw new InvalidMovieSelectionException("Invalid movie selection!");
     }

     if (tickets <= 0) {
         throw new InvalidTicketNumberException("Number of tickets must be greater than zero!");
     }

     if (tickets > maxAvailableTickets) {
         throw new TicketsSoldOutException("Requested number of tickets not available!");
     }

     // Successful booking
     maxAvailableTickets -= tickets;
     int amount = tickets * ticketPrice;

     System.out.println("\n🎉 Booking Successful for \"" + movies[movieNumber - 1] + "\"!");
     System.out.println("Tickets booked: " + tickets);
     System.out.println("Total amount: ₹" + amount + "\n");
 }
}


//---------------- Main Class ----------------
class BollywoodTicketSystem {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("===== Bollywood Movie Ticket Booking System =====\n");

     while (MovieBooking.getRemainingTickets() > 0) {

         System.out.println("Available Movies:");
         for (int i = 0; i < MovieBooking.movies.length; i++) {
             System.out.println((i + 1) + ". " + MovieBooking.movies[i]);
         }

         System.out.println("\nRemaining Tickets: " + MovieBooking.getRemainingTickets());
         System.out.print("Select a movie number: ");
         int movieNumber = sc.nextInt();

         System.out.print("Enter number of tickets: ");
         int tickets = sc.nextInt();

         try {
             MovieBooking.bookTickets(movieNumber, tickets);
         } catch (Exception e) {
             System.out.println("❌ " + e.getMessage() + "\n");
         }
     }

     System.out.println("\nSorry! Tickets are sold out.");
     sc.close();
 }
}
