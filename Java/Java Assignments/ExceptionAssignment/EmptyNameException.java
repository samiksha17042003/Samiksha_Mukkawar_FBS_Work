package ExceptionAssignment;

class EmptyNameException extends Exception {
	public String toString() {
		return "enter the meaning full name";
	}
}
 class UnderageException extends Exception {
	public String toString() {
		return "You can't take the Addmission";
	}
 }
 class InvalidePercentageException extends Exception {
	public String toString() {
		return "Not Eligible For Take Addmission ";
	}
 }
 class NotFitForAdmissionException extends Exception {
		public String toString() {
			return "Not Eligible in the Category";
		}
 }
class feesNotPaidException extends Exception {
			public String toString() {
				return "Fees not paid";
			}
}
class InsufficientFeesException extends Exception {
       public String toString() {
         return "Insufficient fees pay";
				}
}
