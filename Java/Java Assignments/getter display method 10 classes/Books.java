class Books{
int BookId;
String BookName;
String Category;
int Price;

void setBookId(int b){
this.BookId=b;
}
void setBookName(String bn){
this.BookName=bn;
}
void setCategory(String c){
this.Category=c;
}
void setPrice(int p){
this.Price=p;
}
int getBookId(){
return this.BookId;
}
String getBookName(){
return this.BookName;
}
String getCategory(){
return this.Category;
}
int getPrice(){
return this.Price;
}
void display(){
System.out.println("BookId is:"+this.BookId);
System.out.println("BookName is:"+this.BookName);
System.out.println("Category is:"+this.Category);
System.out.println("Price is:"+this.Price);
}
}
class Test{
public static void main(String[] args){
Books b1=new Books();
Books b2=new Books();
b1.setBookId(121);
b1.setBookName("Harry Potter");
b1.setCategory("Story Book");
b1.setPrice(1000);
b2.setBookId(121);
b2.setBookName("Erwin Blumenfeld");
b2.setCategory("Autobiography");
b2.setPrice(10000);
b1.display();
b2.display();
if(b1.getPrice()>b2.getPrice()){
System.out.println("b1 Price is Greater");
} 
else{
System.out.println("b2 Price is Greater");
}
}
}