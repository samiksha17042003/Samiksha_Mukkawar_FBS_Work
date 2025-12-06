class Car{
int Model;
String Brand;
int Price;
String Colour;
int FuelCapacity;
         Car(){
               System.out.println("Car default constructor");
               Model=2000;
               Brand="Testal";
               Price=60000000;
               Colour="Black";
               FuelCapacity=100;
	  }
	 Car(int model, String brand, int price, String colour,int fuelcapacity) {
System.out.println("Car parameterized constructor");
		this.Model=model;
                this.Brand=brand;
                this.Price=price;
                this.Colour=colour;
                this.FuelCapacity=fuelcapacity;

	}

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
Car c1=new Car();
c1.display();
System.out.println();
Car c2=new Car(2021,"BMW",10000000,"White",5000);
c2.display();
System.out.println();
c1.setModel(2025);
c1.setBrand("Tesla");
c1.setPrice(6000000);
c1.setColour("Black");
c1.setFuelCapacity(7000);
c1.display();
}
}
