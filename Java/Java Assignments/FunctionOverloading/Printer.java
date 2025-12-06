package FunctionOverloading;

public class Printer {
     void print() {
    	 System.out.println("Hello");
     }
     void print(int a) {
    	 System.out.println(a);
     }
     void print(char p) {
    	 System.out.println(p);
     }
     void print(String str) {
    	 System.out.println(str);
     }
}
class Test{
	public static void main(String[] args) {
		Printer p=new Printer();
		p.print();
		p.print('S');
		p.print(10);
		p.print("Sachine");
	}
}