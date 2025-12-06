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
}
class Test{
public static void main(String[] args){
Books b=new Books();
b.setBookId(121);
b.setBookName("Komal");
b.setCategory("OPEN");
b.setPrice(1000);
System.out.println("BookId is:"+b.BookId);
System.out.println("BookName is:"+b.BookName);
System.out.println("Category is:"+b.Category);
System.out.println("Price is:"+b.Price);
}
}