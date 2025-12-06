
package Static;

public class ElectricityBill {
	   String CustomerName;
	   int unitConsumed;
       static double ratePerUnit;
       static {
    	   ratePerUnit=5.0;
       }
	public ElectricityBill() {
		CustomerName="Ramesha";
		unitConsumed=50;
	}
	public ElectricityBill(String customerName, int unitConsumed) {
		this.CustomerName = customerName;
		this.unitConsumed = unitConsumed;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getUnitConsumed() {
		return unitConsumed;
	}
	public void setUnitConsumed(int unitConsumed) {
		this.unitConsumed = unitConsumed;
	}
	public static double getRatePerUnit() {
		return ratePerUnit;
	}
	public static void setRatePerUnit(double ratePerUnit) {
		ElectricityBill.ratePerUnit = ratePerUnit;
	}
	
	double CalculateBill() {
		return this.unitConsumed*ratePerUnit;
	}
	
	void display() {
		System.out.println("\nCustomer Name is:"+this.CustomerName);
		System.out.println("Unit Consumed is:"+this.unitConsumed);
		System.out.println("Total Bill Amount is:"+CalculateBill());
	}
}
class Test2{
	public static void main(String[] args) {
		ElectricityBill e1=new ElectricityBill("Dipali",15);
		e1.display();
		ElectricityBill e2=new ElectricityBill("Kartika",20);
		e2.display();
		ElectricityBill e3=new ElectricityBill("Kaushika",10);
		e3.display();
		ElectricityBill.setRatePerUnit(9.2);
		e1.display();
		e2.display();
		e3.display();
	}
}
