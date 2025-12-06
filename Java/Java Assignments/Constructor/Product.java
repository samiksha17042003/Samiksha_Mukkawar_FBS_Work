class Product{

int productid;
String productname;
int price;
int quantity;


Product(){
System.out.println("Product default constructor");
productid=001;
productname="Laptop";
price=120000000;
quantity=5;
}
Product(int productid,String productname,int price,int quantity){
System.out.println("Product parametrized constructor");
this.productid=productid;
this.productname=productname;
this.price=price;
this.quantity=quantity;
}
void setProductid(int pi){
this.productid=pi;
}
void setProductname(String pn){
this.productname=pn;
}
void setPrice(int pi){
this.price=pi;
}
void setQuantity(int i){
this.quantity=i;
}
int getProductid(){
return this.productid;
}
String getProductname(){
return this.productname;
}
int getPrice(){
return this.price;
}
int getQuantity(){
return this.quantity;
}
void display(){
System.out.println("Productid is:"+this.productid);
System.out.println("Productname is:"+this.productname);
System.out.println("Price is:"+this.price);
System.out.println("Quantity is:"+this.quantity);
}
}
class Test{
public static void main(String[] args){
Product p1=new Product();
p1.display();
System.out.println();
Product p2=new Product(901,"Headphones",199000,75);
p2.display();
System.out.println();
p1.setProductid(45);
p1.setProductname("Lamp");
p1.setPrice(50000);
p1.setQuantity(45);
p1.display();
System.out.println();
p2.setProductid(450);
p2.setProductname("Smartphone");
p2.setPrice(8000000);
p2.setQuantity(120);
p2.display();
if(p1.getPrice()>p2.getPrice()){
System.out.println("p1 Price is Greater");
} 
else{
System.out.println("p2 Price is Greater");
}

}
}




