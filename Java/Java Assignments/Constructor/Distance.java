class Distance
{
double km;
double m;
Distance(){
System.out.println("Distance default constructor");
km=50;
m=80;
}
Distance(double k,double m){
System.out.println("Distance parameterized constructor");
this.km=k;
this.m=m;
}
void setKm(double i){
this.km=i;
}
void setM(double j){
this.m=j;
}
double getKm(){
return this.km; 
}
double getM(){
return this.m;
}
void display(){
System.out.println("Kilometre is:"+this.km);
System.out.println("Metre is:"+this.m);
}
}
class Test{
public static void main(String args[]){
Distance d1=new Distance();
d1.display();
System.out.println();
Distance d2=new Distance(70000,5000);
d2.display();
System.out.println();
d1.setKm(80);
d1.setM(50);
d2.setKm(90);
d2.setM(40);
d1.display();
System.out.println();
d2.display();
}
}