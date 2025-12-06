class Date{
int day,month,year;
String dow;
void setDay(int x){
 this.day=x;
}
void setMonth(int x){
this.month=x;
}
void setYear(int x){
this.year=x;
}
void setDow(String x){
this.dow=x;
}
}//Date end here
class Test1{
public static void main(String args[]){
Date d1;
 d1=new Date();
 d1.setDay(31);
 d1.setMonth(10);
 d1.setYear(2025);
 d1.setDow("Monday");
System.out.print("Date is:"+d1.day+"/"+d1.month+"/"+d1.year+"/"+d1.dow);
} 
}//Test end here