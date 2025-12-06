 package ToString;

class Date extends Object{
int day,month,year;
String dow; 
public String toString() {
	return "Date is:"+this.day+"/"+this.month+"/"+this.year+"/"+this.dow;
}
}//Date end here
class Test extends Date{
public static void main(String args[]){
Date d1,d2;//references
d1=new Date();
System.out.println(d1.toString());
d1.day=7;
d1.month=11;
d1.year=2025;
d1.dow="friday";
System.out.println(d1);// Calls toString()
//System.out.print("Date is:"+d1.day+"/"+d1.month+"/"+d1.year+"/"+d1.dow);
}
}//Test end here 


