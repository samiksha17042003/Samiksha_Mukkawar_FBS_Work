package Inheritance;

public class Shapes {
	int noofvertices ;
	int noofangles;
	int noofedges;
	static int count;
	public int getNoofvertices() {
		return noofvertices;
	}
	public void setNoofvertices(int noofvertices) {
		this.noofvertices = noofvertices;
	}
	public int getNoofangles() {
		return noofangles;
	}
    public void setNoofangles(int noofangles) {
		this.noofangles = noofangles;
	}
	public int getNoofedges() {
		return noofedges;
	}

	public void setNoofedges(int noofedges) {
		this.noofedges = noofedges;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Shapes.count = count;
	}
	Shapes()
	{
		
		 noofvertices=8;
		 noofangles=4;
		 noofedges=6;
		 count++;
	}
	public Shapes(int noofvertices, int noofangles, int noofedges) {
		super();
		this.noofvertices = noofvertices;
		this.noofangles = noofangles;
		this.noofedges = noofedges;
		count++;
	}
	void display() {
		
		System.out.println("Noofvertices is:"+this.noofvertices);
		System.out.println("Noofangles is:"+this.noofangles);
		System.out.println("Noofedges is:"+this.noofedges);
	}
	
}
class Circle extends Shapes{
	double Areaofcircle;
	int radius;
	int noofcord;
	int diameter;
	public double getAreaofcircle() {
		return Areaofcircle;
	}
	public void setArea(double Areaofcircle) {
		this.Areaofcircle = Areaofcircle;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getNoofcord() {
		return noofcord;
	}
	public void setNoofcord(int noofcord) {
		this.noofcord = noofcord;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	Circle(){
		radius=5;
		noofcord=4;
		diameter=10;
		Areaofcircle=3.14*radius*radius;
	}
	public Circle( int noofvertices, int noofangles, int noofedges,int radius, int noofcord, int diameter,double Areaofcircle) {
		super(noofvertices,noofangles,noofedges);
		this.radius = radius;
		this.noofcord = noofcord;
		this.diameter = diameter;
		this.Areaofcircle=Areaofcircle;
	}
	void display() {
		super.display();
		System.out.println("Areaofcircle is:"+this.Areaofcircle);
		System.out.println("Radius is:"+this.radius);
		System.out.println("Noofcord is:"+this.noofcord);
		System.out.println("Diameter is:"+this.diameter);
	}
}
class Square extends Shapes{
	int side;
	int areaofsquare;
	
	public int getAreaofsquare() {
		return areaofsquare;
	}

	public void setAreaofsquare(int areaofsquare) {
		this.areaofsquare = areaofsquare;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	Square(){
		side=4;
		areaofsquare=side*side;
		
	}

	public Square( int noofvertices, int noofangles, int noofedges,int side,int areaofsquare) {
		super(noofvertices,noofangles,noofedges);
		this.side = side;
		this.areaofsquare=areaofsquare;
	}
	void display() {
		super.display();
		System.out.println("Side is:"+this.side);
		System.out.println("Areaofsquare is:"+this.areaofsquare);
		
	}
}
class Rectangle extends Shapes{
	int length;
	int width;
	int areaofrectangle;
	
	public int getAreaofrectangle() {
		return areaofrectangle;
	}
	public void setAreaofrectangle(int areaofrectangle) {
		this.areaofrectangle = areaofrectangle;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	Rectangle(){
		 length=10;
		 width=8;
		 areaofrectangle=length*width;
	}
	public Rectangle(int noofvertices, int noofangles, int noofedges,int length, int width, int areaofrectangle) {
		super(noofvertices,noofangles,noofedges);
		this.length = length;
		this.width = width;
		this.areaofrectangle = areaofrectangle;
	}
	void display() {
		super.display();
		System.out.println("Length is:"+this.length);
		System.out.println("Width is:"+this.width);
		System.out.println("Areaofrectangle is:"+this.areaofrectangle);
		
	}
	
}
class DemoInheritance5{
	 public static void main(String[] args) {
		 Circle c=new Circle(0,0,0,360,5,10,10);
		 c.display();
		 System.out.println();
		 Square s=new  Square();
		 s.display();
		 System.out.println();
		 Rectangle r=new  Rectangle(4,4,6,5,6,30);
		 r.display();
		 System.out.println("Shapes total count is:"+Shapes.getCount());
	}
}
