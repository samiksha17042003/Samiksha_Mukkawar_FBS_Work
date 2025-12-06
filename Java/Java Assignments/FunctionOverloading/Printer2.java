package FunctionOverloading;

public class Printer2 {
     int print(int a) {
    	 System.out.println(a);
    	 return a;
     }
     void print(int a,String b) {
    	 System.out.println("Output:"+a+":"+b);
     }
     void print(String str) {
    	 System.out.println(str);
     }
     void print(String a,int b) {
    	 System.out.println("Output:"+a+":"+b);
     }
}
class Test1{
	public static void main(String[] args) {
		Printer2 p=new Printer2();
		p.print(100);
		p.print(50,"Hii");
		p.print("HelloWorld");
		p.print("Sachine",45);
	}
}