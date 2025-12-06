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
}
class Test{
public static void main(String[] args){
Product p=new Product();
p.setProductid(45);
p.setProductname("Laptop");
p.setPrice(50000);
p.setQuantity(9);
System.out.println("Productid is:"+p.productid);
System.out.println("Productname is:"+p.productname);
System.out.println("Price is:"+p.price);
System.out.println("Quantity is:"+p.quantity);
}
}




