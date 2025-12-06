class Complex{
int real;
int imaginer;


Complex(){
System.out.println("Complex default constructor");
real=0;
imaginer=-4;
}
Complex(int real,int imaginer){
System.out.println("Complex Parametrized constructor");
this.real=real;
this.imaginer=imaginer;
}
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
System.out.println("Real Number:"+this.real);
System.out.println("Imaginer Number:"+this.imaginer);
}
}
class Test{
public static void main(String[] args){
Complex c1=new Complex();
c1.display();
System.out.println();
Complex c2=new Complex(3,-25);
c2.display();
System.out.println();
c1.setReal(5);
c1.setImaginer(3);
c1.display();
}
}


