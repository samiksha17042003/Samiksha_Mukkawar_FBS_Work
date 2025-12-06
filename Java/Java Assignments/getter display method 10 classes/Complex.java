class Complex{
int real;
int imaginer;

void setReal(int r){
this.real=r;
}
void setImaginer(int i){
this.imaginer=i;
}
int getReal(){
return this.real;
}
int getImaginer(){
return this.imaginer;
}
void display(){
System.out.println("Real Number-"+this.real);
System.out.println("Imaginer Number-"+this.imaginer);
}
}
class Test{
public static void main(String[] args){
Complex c=new Complex();
c.setReal(5);
c.setImaginer(3);
c.display();
}
}


