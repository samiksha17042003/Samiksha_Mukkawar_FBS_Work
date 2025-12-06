class Date{
int day,month,year;
String dow;
void setDay(int x){
 this.day=x;
}
}//Date end here
class Test1{
public static void main(String args[]){
Date d1;
 d1=new Date();
 d1.setDay(31);
} 
}