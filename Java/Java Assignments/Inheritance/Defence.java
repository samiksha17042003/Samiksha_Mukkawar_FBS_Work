package Inheritance;

public class Defence {
	String HeadName;
	int noofvechicle;
	int budget;
	int noofdept;
	int noofmission;
	String locationofHeadquator;
	static int count;
	public String getHeadName() {
		return HeadName;
	}
	public void setHeadName(String HeadName) {
		this.HeadName = HeadName;
	}
	public int getNoofvechicle() {
		return noofvechicle;
	}
	public void setNoofvechicle(int noofvechicle) {
		this.noofvechicle = noofvechicle;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public int getNoofdept() {
		return noofdept;
	}
	public void setNoofdept(int noofdept) {
		this.noofdept = noofdept;
	}
	public int getNoofmission() {
		return noofmission;
	}
	public void setNoofmission(int noofmission) {
		this.noofmission = noofmission;
	}
	public String getNoofHeadquator() {
		return locationofHeadquator;
	}
	public void setNoofHeadquator(String noofHeadquator) {
		this.locationofHeadquator = noofHeadquator;
	}
	static int getCount() {
		return count;
	}
	 static void setCount(int count) {
		 Defence.count = count;
	}
	Defence(){
		 HeadName="Rajnath Singh";
		 noofvechicle=45609;
		 budget=7356372;
		 noofdept=45;
		 noofmission=70;
		 locationofHeadquator="India";
		 count++;
	}
	public Defence(String HeadName,int noofvechicle, int budget, int noofdept, int noofmission, String locationofHeadquator) {
		super();
		this.HeadName=HeadName;
		this.noofvechicle = noofvechicle;
		this.budget = budget;
		this.noofdept = noofdept;
		this.noofmission = noofmission;
		this.locationofHeadquator = locationofHeadquator;
		count++;
	}
	void display() {
		System.out.println("HeadName is:"+this.HeadName);
		System.out.println("Noofvechicle is:"+this.noofvechicle); 
		System.out.println("Budget is:"+this.budget);
		System.out.println("Totaldept is:"+this.noofdept);
		System.out.println("Totalmission  is:"+this.noofmission );
		System.out.println("LocationofHeadquator is:"+this.locationofHeadquator);
	}

}
class Army extends Defence{
	int noofguns;
	int noofguards;
	int noofbattalion;
	public int getNoofguns() {
		return noofguns;
	}
	public void setNoofguns(int noofguns) {
		this.noofguns = noofguns;
	}
	public int getNoofguards() {
		return noofguards;
	}
	public void setNoofguards(int noofguards) {
		this.noofguards = noofguards;
	}
	public int getNoofbattalion() {
		return noofbattalion;
	}
	public void setNoofbattalion(int noofbattalion) {
		this.noofbattalion = noofbattalion;
	}
	Army(){
		 noofguns=50000;
		 noofguards=9000000;
		 noofbattalion=10;
	}
	public Army(String HeadName,int noofvechicle, int budget, int noofdept, int noofmission, String locationofHeadquator,int noofguns, int noofguards, int noofbattalion) {
		super(HeadName, noofvechicle, budget, noofdept, noofmission,locationofHeadquator);
		this.noofguns = noofguns;
		this.noofguards = noofguards;
		this.noofbattalion = noofbattalion;
	}
	void display() {
		super.display();{
			System.out.println("Totalguns is:"+this.noofguns);
			System.out.println("Totalguards is:"+this.noofguards);
			System.out.println("Totalbattalion is:"+this.noofbattalion);
			
		}
	}
	
}
class Navi extends Defence{
	int noofship;
	int noofsubmarine;
	int nooftorpedoes;
	public int getNoofship() {
		return noofship;
	}
	public void setNoofship(int noofship) {
		this.noofship = noofship;
	}
	public int getNoofsubmarine() {
		return noofsubmarine;
	}
	public void setNoofsubmarine(int noofsubmarine) {
		this.noofsubmarine = noofsubmarine;
	}
	public int getNooftorpedoes() {
		return nooftorpedoes;
	}
	public void setNooftorpedoes(int nooftorpedoes) {
		this.nooftorpedoes = nooftorpedoes;
	}
	Navi(){
		noofship=100000;
		 noofsubmarine=7650;
		 nooftorpedoes=4000;
	}
	public Navi(String HeadName,int noofvechicle, int budget, int noofdept, int noofmission, String locationofHeadquator,int noofship, int noofsubmarine, int nooftorpedoes) {
		super(HeadName, noofvechicle, budget, noofdept, noofmission,locationofHeadquator);
		this.noofship = noofship;
		this.noofsubmarine = noofsubmarine;
		this.nooftorpedoes = nooftorpedoes;
	}
	void display() {
		super.display();
		System.out.println("Totalship is:"+this.noofship);
		System.out.println("Totalsubmarine is:"+this.noofsubmarine);
		System.out.println("Totaltorpedoes  is:"+this.nooftorpedoes );
		
	}
}
class Air extends Defence{
	int noofmissions;
	int nofaircraft;
	int noofdron;
	public int getNoofmissions() {
		return noofmissions;
	}
	public void setNoofmissions(int noofmissions) {
		this.noofmissions = noofmissions;
	}
	public int getNofaircraft() {
		return nofaircraft;
	}
	public void setNofaircraft(int nofaircraft) {
		this.nofaircraft = nofaircraft;
	}
	public int getNoofdron() {
		return noofdron;
	}
	public void setNoofdron(int noofdron) {
		this.noofdron = noofdron;
	}
	Air(){
		 noofmissions=150;
		 nofaircraft=800;
		 noofdron=5000;
	}
	public Air(String HeadName,int noofvechicle, int budget, int noofdept, int noofmission, String locationofHeadquator,int noofmissions, int nofaircraft, int noofdron) {
		super(HeadName, noofvechicle, budget, noofdept, noofmission,locationofHeadquator);
		this.noofmissions = noofmissions;
		this.nofaircraft = nofaircraft;
		this.noofdron = noofdron;
	}
	void display() {
		super.display();
		System.out.println("TotalMissions is:"+this.noofmissions);
		System.out.println("TotalAircraft is:"+this.nofaircraft);
		System.out.println("TotalDron is:"+this.noofdron);
		
	}
	
}
class DefenceInheritance{
	 public static void main(String[] args) {
		 Army a=new Army();
		 a.display();
		 System.out.println();
		 a=new Army("Lt. General Manoj Pande", 30000, 9000000, 12, 45, 
                 "Delhi HQ", 55000, 8000000, 15);
		 a.display();
		 System.out.println();
		 Navi n=new Navi();
		 n.display();
		 System.out.println();
		 Air ai=new Air();
		 ai.display();
		 System.out.println("Defence total count is:"+Defence.getCount());
	}
}