package Static;

public class LibraryUser {
       String name;
       int dayLate;
       static double finePerDay;
	
       static {
    	   finePerDay=100;  
       }
	public LibraryUser() {
		    name="Shravani";
	        dayLate=10;
	      
	}
	public LibraryUser(String name, int dayLate) {
		this.name = name;
		this.dayLate = dayLate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDayLate() {
		return dayLate;
	}
	public void setDayLate(int dayLate) {
		this.dayLate = dayLate;
	}
	public static double getFinePerDay() {
		return finePerDay;
	}
	public static void setFinePerDay(double finePerDay) {
		LibraryUser.finePerDay = finePerDay;
	}
	double CalculateFine() {
		if(dayLate<=0) {
			return 0.0;
		}
		return this.dayLate*finePerDay;
	}
	void display() {
		System.out.println("\nUser Name is:"+this.name);
		System.out.println("Days Late is:"+this.dayLate);
		System.out.println("Fine Amount is:"+CalculateFine());
	}
}
class Test1{
	public static void main(String[] args) {
		LibraryUser l1=new LibraryUser("Dipali",15);
		l1.display();
		LibraryUser l2=new LibraryUser("Kartika",20);
		l2.display();
		LibraryUser l3=new LibraryUser("Kaushika",0);
		l3.display();
		LibraryUser.setFinePerDay(120);
		l1.display();
		l2.display();
		l3.display();
	}
}
