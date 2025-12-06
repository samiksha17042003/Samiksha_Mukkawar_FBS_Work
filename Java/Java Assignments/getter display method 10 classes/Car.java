class Car{
int Model;
String Brand;
int Price;
String Colour;
int FuelCapacity;

void setModel(int m){
this.Model=m;
}
void setBrand(String m){
this.Brand=m;
}
void setPrice(int p){
this.Price=p;
}
void setColour(String c){
this.Colour=c;
}
void setFuelCapacity(int i){
this.FuelCapacity=i;
}
int getModel(){
return this.Model;
}
String getBrand(){
return this.Brand;
}
int getPrice(){
return this.Price;
}
String getColour(){
return this.Colour;
}
int getFuelCapacity(){
return this.FuelCapacity;
}
void display(){
System.out.println("Model is:"+this.Model);
System.out.println("Brand is:"+this.Brand);
System.out.println("Price is:"+this.Price);
System.out.println("Colour is:"+this.Colour);
System.out.println("FuelCapacity is:"+this.FuelCapacity);
}
}
class Test{
public static void main(String[] args){
Car c=new Car();
c.setModel(2000);
c.setBrand("Tesla");
c.setPrice(6000000);
c.setColour("Black");
c.setFuelCapacity(7000);
c.display();
}
}
