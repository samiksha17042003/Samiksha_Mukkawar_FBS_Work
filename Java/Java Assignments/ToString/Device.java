package ToString;

class Device{
	String Brand;
	String Model;
	int price;
	int batterylevel;
	
	 String getBrand() {
		return Brand;
	}
	void setBrand(String brand) {
		Brand = brand;
	}
	 String getModel() {
		return Model;
	}
	void setModel(String model) {
		Model = model;
	}
	 int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	 int getBatterylevel() {
		return batterylevel;
	}
	 void setBatterylevel(int batterylevel) {
		this.batterylevel = batterylevel;
	}
	
	Device(){
		Brand="Apple";
		Model="iPhone17";
		price=500000;
		batterylevel=100;
		
	}
	Device(String brand, String model, int price, int batterylevel) {
		super();
		this.Brand = brand;
		this.Model = model;
		this.price = price;
		this.batterylevel = batterylevel;
		
	}
	
	public String toString(){
		return "Brand is:"+this.Brand+"\nModel is:"+this.Model+"\nPrice is:"+this.price+"\nBatterylevel is:"+this.batterylevel; 
	 }

}
class Mobile extends Device{
	int simslots;
	int cameraMP;
	int storage;
	String is5G;
	 int getSimslots() {
		return simslots;
	}
	 void setSimslots(int simslots) {
		this.simslots = simslots;
	}
	int getCameraMP() {
		return cameraMP;
	}
	 void setCameraMP(int cameraMP) {
		this.cameraMP = cameraMP;
	}
	int getStorage() {
		return storage;
	}
	void setStorage(int storage) {
		this.storage = storage;
	}
	 String getIs5G() {
		return is5G;
	}
	void setIs5G(String is5g) {
		is5G = is5g;
	}
	Mobile(){
		super();
		simslots =2;
		cameraMP=50;
		storage=256;
		is5G="yes";
	}
	 Mobile(String brand, String model, int price, int batterylevel,int simslots, int cameraMP, int storage, String is5g) {
		super(brand,model,price,batterylevel);
		this.simslots = simslots;
		this.cameraMP = cameraMP;
		this.storage = storage;
		this.is5G = is5g;
	}
	 public String toString(){
			return super.toString()+"\nSimslots is:"+this.simslots+"\nCameraMP is:"+this.cameraMP+"\nStorage is:"+this.storage+"\nIs5G:"+this.is5G; 
		 }
}
class Laptop extends Device{
	int ramsize;
	String processor;
	String OperatingSystem;
	 int getRamsize() {
		return ramsize;
	}
	void setRamsize(int ramsize) {
		this.ramsize = ramsize;
	}
	String getProcessor() {
		return processor;
	}
	void setProcessor(String processor) {
		this.processor = processor;
	}
	 String getOperatingSystem() {
		return OperatingSystem;
	}
	 void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}
	Laptop(){
		ramsize=64;
		processor="Ryzen";
		OperatingSystem="windows";
	}
	 Laptop(String brand, String model, int price, int batterylevel,int ramsize, String processor, String operatingSystem) {
		super(brand,model,price,batterylevel);
		this.ramsize = ramsize;
		this.processor = processor;
		OperatingSystem = operatingSystem;
	}
	 public String toString(){
			return super.toString()+"\nRamsize is:"+this.ramsize+"\nProcessor is:"+this.processor+"\nOperatingSystem is:"+this.OperatingSystem; 
		 }
}
class SmartWatch extends Device{
	int HeartRate;
	int stepcount;
	 int getHeartRate() {
		return HeartRate;
	}
	 void setHeartRate(int heartRate) {
		HeartRate = heartRate;
	}
	 int getStepcount() {
		return stepcount;
	}
	 void setStepcount(int stepcount) {
		this.stepcount = stepcount;
	}
	SmartWatch(){
		HeartRate=90;
		stepcount=10000;
	}
	 SmartWatch(String brand, String model, int price, int batterylevel,int heartRate, int stepcount) {
		super(brand,model,price,batterylevel);
		HeartRate = heartRate;
		this.stepcount = stepcount;
	}
	public String toString(){
		return super.toString()+"HeartRate is:"+this.HeartRate+"Stepcount is:"+this.stepcount; 
	 }
}
class Test8{
	 public static void main(String[] args) {
		 Device d=new  Device();
		 d=new Mobile("Samsunga","Galaxy A26 5G",24999,5000,2,50,128,"Yes");
		 System.out.println(d);
		 System.out.println();
		 d=new Laptop();
		 System.out.println(d);
		 System.out.println();
		 d=new SmartWatch("Samsunga","Galaxy Watch7",32999,5000,1000,10000);
		 System.out.println(d);
		
	}
}


