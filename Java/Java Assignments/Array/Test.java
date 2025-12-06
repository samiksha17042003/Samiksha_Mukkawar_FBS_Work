class Date{
int day,month,year;
String dow; 
}//Date end here
class Test{
public static void main(String args[]){
Date d1,d2;//references
d1=new Date();
System.out.println(d1);
d2=new Date();
System.out.println(d2);
//System.out.print("%d/%d/%d",d1.day,d1.month,d1.year);
System.out.println("Date is:"+d1.day+"/"+d1.month+"/"+d1.year+"/"+d1.dow);
d1.day=7;
d1.month=11;
d1.year=2025;
//System.out.print(%d"/"%d"/"%d,d1.day,d1.month,d1.year);
System.out.print("Date is:"+d1.day+"/"+d1.month+"/"+d1.year+"/"+d1.dow);
}
}

