class Complex{
int real;
int imaginer;

void setReal(int r){
this.real=r;
}
void setImaginer(int i){
this.imaginer=i;
}
}
class Test{
public static void main(String[] args){
Complex c=new Complex();
c.setReal(5);
c.setImaginer(3);
System.out.println("Real Number-"+c.real);
System.out.println("Imaginer Number-"+c.imaginer);
}
}


