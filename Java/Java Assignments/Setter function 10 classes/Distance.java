class Distance
{
double Km;
double M;

void setKm(double k){
this.Km=k;
}
void setM(double m){
this.M=m;
}
}
class Test{
public static void main(String args[]){
Distance d=new Distance();
d.setKm(80);
d.setM(50);
System.out.println("Kilometre is:"+d.Km);
System.out.println("Metre is:"+d.M);
}
}