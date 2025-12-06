package FunctionOverloading;

public class Calculator {

//Function to add two int
int add(int a, int b) {
return a + b;
}

// Function to add two doubles
double add(double a, double b) {
return a + b;
}

// Function to add one int and one double
double add(int a, double b) {
return a + b;
}

// Function to add one double and one int
double add(double a, int b) {
return a + b;
}

// Subtraction functions (similar overloading)
int subtract(int a, int b) { 
return a - b;
}
double subtract(double a, double b){
return a - b; 
}
double subtract(int a, double b) { 
return a - b;
}
double subtract(double a, int b) { 
return a - b; 
}

// Multiplication functions 
int multiply(int a, int b) {
return a * b;
}
double multiply(double a, double b) {
return a * b;
}
double multiply(int a, double b) { 
return a * b; 
}
double multiply(double a, int b) { 
return a * b;
}

// Division functions
double divide(int a, int b) { 
return a / b; 
}
double divide(double a, double b) {
return a / b;
}
double divide(int a, double b) {
return a / b;
}
double divide(double a, int b) {
return a / b;
}
}
class Test4{
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		int a=10;
		double b=25.45;
		System.out.println(c1.add(a,a));
		System.out.println(c1.divide(b,b));
		System.out.println(c1.subtract(b,a));
		System.out.println(c1.multiply(b,a));
	}
}