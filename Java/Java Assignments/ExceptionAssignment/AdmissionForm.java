package ExceptionAssignment;

public class AdmissionForm {
      String StudentName;
      int age;
      double percentage;
      double coursefees;
      double feesPaid;
	   AdmissionForm(String studentName, int age, double percentage, double coursefees, double feesPaid) {
		this.StudentName = studentName;//only parametrized constructor
		this.age = age;
		this.percentage = percentage;
		this.coursefees = coursefees;
		this.feesPaid = feesPaid;
	}
	   void validateForm() throws EmptyNameException,UnderageException,InvalidePercentageException,NotFitForAdmissionException,feesNotPaidException,InsufficientFeesException{
		   if(this.StudentName == null||StudentName.trim().isEmpty()) {
				 throw new EmptyNameException();
			 }
			 else {
				 System.out.println("Name is:"+this.StudentName);
			 }
		    if(this.age<17){
				 throw new UnderageException();
			 }
			 else {
				// System.out.println("You can't take the addmission");
				 System.out.println("Age is:"+this.age);
			 }
		   if(this.percentage<0||percentage>100) {
				 
				 throw new InvalidePercentageException();
			 }
			 else {
				 //System.out.println("Not Eligible For Take Adddmission ");
				 System.out.println("Percentage is:"+this.percentage);
			 }
		   
		   if(this.percentage<35) {
				 
				 throw new NotFitForAdmissionException();
			 }
			 else {
				// System.out.println("Not Eligible in the Caratory");
				 //System.out.println("Percentage is:"+this.percentage);
			 }
		   
		   if(this.feesPaid==0) {
				 
				 throw new feesNotPaidException();
			 }
			 else {
				// System.out.println("Fees not paid");
				 //System.out.println("feesPaid is"+this.feesPaid);
			 }
		   if(this.feesPaid<(0.30*coursefees)) {
				 
				 throw new InsufficientFeesException();
			 }
			 else {
				 System.out.println("feesPaid is:"+this.feesPaid);
			 }
		   
	   }
}
	
	   class Test1{
		   public static void main(String[] args) {
			   AdmissionForm  a=new AdmissionForm("Samiksha",
		                17,
		                78.40,
		                50000,90000.0);
		   	try {
		   		a.validateForm();
		   		System.out.println("Addmission Sucessfully");
		   	} catch ( EmptyNameException e) {
		   		System.err.println(e);
		   	}
		   	catch (UnderageException e) {
		   		System.err.println(e);
		   	}
		   	catch (InvalidePercentageException e) {
		   		System.err.println(e);
		   	}
		   	catch (NotFitForAdmissionException e) {
		   		System.err.println(e);
		   	}
		   	catch (feesNotPaidException e){
		   		System.err.println(e); 
		   	}
		   	catch ( InsufficientFeesException e) {
		   		System.err.println(e);
		   	}
		   }
	   }
		   
	
