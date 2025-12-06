package ToString;

class Farmer {
int farmerId;
String farmername;
int area;
int annualincome;
int noofequipments;

public int getFarmerId() {
	return farmerId;
}
public void setFarmerId(int farmerId) {
	this.farmerId = farmerId;
}
public String getFarmername() {
	return farmername;
}
public void setFarmername(String farmername) {
	this.farmername = farmername;
}
public int getArea() {
	return area;
}
public void setArea(int area) {
	this.area = area;
}
public int getAnnualincome() {
	return annualincome;
}
public void setAnnualincome(int annualincome) {
	this.annualincome = annualincome;
}
public int getNoofequipments() {
	return noofequipments;
}
public void setNoofequipments(int noofequipments) {
	this.noofequipments = noofequipments;
}

Farmer(){
	farmerId=121;
	 farmername="Shiva";
	 area=1000;
	 annualincome=33000;
	 noofequipments=35;
	
}
public Farmer(int farmerId, String farmername, int area, int annualincome, int noofequipments) {
	super();
	this.farmerId = farmerId;
	this.farmername = farmername;
	this.area = area;
	this.annualincome = annualincome;
	this.noofequipments = noofequipments;
	
}

public String toString(){
	return"FarmerId is:"+this.farmerId+"\nFarmername is:"+this.farmername+"\nArea is:"+this.area+"\nAnnualincome is:"+this.annualincome+"\nTotalEquipments is:"+this.noofequipments; 
 }

}
class Dairyfarmer extends Farmer{
	int noofcattles;
	int milkproductionrate;
	int dairylicencesno;
	public int getNoofcattles() {
		return noofcattles;
	}
	public void setNoofcattles(int noofcattles) {
		this.noofcattles = noofcattles;
	}
	public int getMilkproductionrate() {
		return milkproductionrate;
	}
	public void setMilkproductionrate(int milkproductionrate) {
		this.milkproductionrate = milkproductionrate;
	}
	public int getDairylicencesno() {
		return dairylicencesno;
	}
	public void setDairylicencesno(int dairylicencesno) {
		this.dairylicencesno = dairylicencesno;
	}
	Dairyfarmer(){
		noofcattles=50;
		milkproductionrate=86;
		dairylicencesno=3241524;
	}
	public Dairyfarmer(int farmerId, String farmername, int area, int annualincome, int noofequipments,int noofcattles, int milkproductionrate, int dairylicencesno) {
		super(farmerId, farmername, area,annualincome, noofequipments);
		this.noofcattles = noofcattles;
		this.milkproductionrate = milkproductionrate;
		this.dairylicencesno = dairylicencesno;
	}
	public String toString(){
		return super.toString()+"\nTotalCattles is:"+this.noofcattles+"\nMilkproductionrate is:"+this.milkproductionrate+"\nDairylicencesno is:"+this.dairylicencesno; 
	 }
	
}
class PoultryFarmer extends Farmer{
	int noofchickens;
	int noofshades;
	int eggproduction;
	String PoultryFarmerName;
	public int getNoofchickens() {
		return noofchickens;
	}
	public void setNoofchickens(int noofchickens) {
		this.noofchickens = noofchickens;
	}
	public int getNoofshades() {
		return noofshades;
	}
	public void setNoofshades(int noofshades) {
		this.noofshades = noofshades;
	}
	public int getEggproduction() {
		return eggproduction;
	}
	public void setEggproduction(int eggproduction) {
		this.eggproduction = eggproduction;
	}
	public String getPoultryFarmerName() {
		return PoultryFarmerName;
	}
	public void setPoultryFarmerName(String poultryFarmerName) {
		PoultryFarmerName = poultryFarmerName;
	}
	PoultryFarmer(){
		noofchickens=50;
		noofshades=12;
		eggproduction=300;
		PoultryFarmerName="Suguna Foods";
	}
	public PoultryFarmer(int farmerId, String farmername, int area, int annualincome, int noofequipments,int noofchickens, int noofshades, int eggproduction, String poultryFarmerName) {
		super(farmerId, farmername, area,annualincome, noofequipments);
		this.noofchickens = noofchickens;
		this.noofshades = noofshades;
		this.eggproduction = eggproduction;
		PoultryFarmerName = poultryFarmerName;
	}
	public String toString(){
		return super.toString()+"\nTotalchickens is:"+this.noofchickens+"\nTotalofshades is:"+this.noofshades+"\nEggproduction is:"+this.eggproduction+"\nPoultryFarmerName is:"+this.PoultryFarmerName ; 
	 }
}
class Organicfarmer extends Farmer{
	int OrangicID;
	String CropType;
	String Fertilizerused;
	public int getOrangicID() {
		return OrangicID;
	}
	public void setOrangicID(int orangicID) {
		OrangicID = orangicID;
	}
	public String getCropType() {
		return CropType;
	}
	public void setCropType(String cropType) {
		CropType = cropType;
	}
	public String getFertilizerused() {
		return Fertilizerused;
	}
	public void setFertilizerused(String fertilizerused) {
		Fertilizerused = fertilizerused;
	}
	Organicfarmer(){
		OrangicID=1231;
		CropType="Wheat";
		Fertilizerused="Urea";
	}
	public Organicfarmer(int farmerId, String farmername, int area, int annualincome, int noofequipments,int orangicID, String cropType, String fertilizerused) {
		super(farmerId, farmername, area,annualincome, noofequipments);
		this.OrangicID = orangicID;
		this.CropType = cropType;
		this.Fertilizerused = fertilizerused;
	}
	public String toString(){
		return super.toString()+"\nOrangicID is:"+this.OrangicID+"\nCropType is:"+this.CropType+"\nFertilizerused  is:"+this.Fertilizerused; 
	 }
	
}
class Test9{
	 public static void main(String[] args) {
		 Farmer f=new Farmer();
		 f=new PoultryFarmer(1234,"Sumit",3,500000,3,120,55,450,"Sayva");
		 System.out.println(f);
		 System.out.println();
		 f=new Dairyfarmer(1234,"Rajesh",3,500000,3,8,80,34231);
		 System.out.println(f);
		 System.out.println();
		 f=new  Organicfarmer();
		 System.out.println(f);
		
	}
}

