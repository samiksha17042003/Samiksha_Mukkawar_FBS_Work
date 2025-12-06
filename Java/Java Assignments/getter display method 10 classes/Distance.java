class Distance
{
double km;
double m;
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
Distance d2=new Distance();
d1.setKm(80);
d1.setM(50);
d2.setKm(90);
d2.setM(40);
d1.display();
d2.display();
}
}