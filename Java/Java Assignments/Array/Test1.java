class Date{
int day,month,year;
String dow;

Date(){
System.out.println("Date Default Constructor");
day=18;
month=11;
year=2025;
dow="Wednesday";
}
Date(int day,int month,int year,String dow){
System.out.println("Date Parametrized Constructor");
this.day=day;
this.month=month;
this.year=year;
this.dow=dow;
}
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
int getDay(){
return this.day;
}
int getMonth(){
return this.month;
}
int getYear(){
return this.year;
}
String getDow(){
return this.dow;
}
void display(){
System.out.println("Day is:"+this.day);
System.out.println("Month is:"+this.month);
System.out.println("Year is:"+this.year);
System.out.println("DOW is:"+this.dow);
}
}//Date end here
class Test1{
public static void main(String args[]){
Date arr[]=new Date[3];//array of references
arr[0]=new Date();
arr[1]=new Date(7,11,2025,"Firday");
arr[2]=new Date();
//arr[3]=new Date();
for(int i=0;i<arr.length;i++){
//System.out.println(arr[i]);
arr[i].display();
System.out.println();
}
Date d1,d2;
 d1=new Date();
 d1.display();
 d2=new Date(12,10,2025,"Friday");
 d2.display();
 d1.setDay(2);
 d2.setDay(3);
 d1.setMonth(10);
 d2.setMonth(10);
 d1.setYear(2025);
 d2.setYear(2025);
 d1.setDow("Monday");
 d1.display();
 d2.display();
//System.out.print("Date is:"+d1.day+"/"+d1.month+"/"+d1.year+"/"+d1.dow);
if(d1.getDay()>d2.getDay()){
System.out.println("d1 is Younger");
} 
else{
System.out.println("d2 is Younger");
} 
}
}//Test end here