class Product{

int productid;
String productname;
int price;
int quantity;

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
Product p2=new Product();
p1.setProductid(08);
p1.setProductname("Laptop");
p1.setPrice(500000);
p1.setQuantity(9);
p1.display();
p2.setProductid(09);
p2.setProductname("Smartphone");
p2.setPrice(700000);
p2.setQuantity(30);
p2.display();
if(p1.getPrice()>p2.getPrice()){
System.out.println("p1 Price is Greater");
} 
else{
System.out.println("p2 Price is Greater");
}
}
}




