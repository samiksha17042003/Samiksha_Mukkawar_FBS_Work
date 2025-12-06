package Abstraction;

abstract class Defence {
	String HeadName;
	int noofvechicle;
	int budget;
	int noofdept;
	int noofmission;
	String locationofHeadquator;
	
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
	
	Defence(){
		 HeadName="Rajnath Singh";
		 noofvechicle=45609;
		 budget=7356372;
		 noofdept=45;
		 noofmission=70;
		 locationofHeadquator="India";
		
	}
	public Defence(String HeadName,int noofvechicle, int budget, int noofdept, int noofmission, String locationofHeadquator) {
		super();
		this.HeadName=HeadName;
		this.noofvechicle = noofvechicle;
		this.budget = budget;
		this.noofdept = noofdept;
		this.noofmission = noofmission;
		this.locationofHeadquator = locationofHeadquator;
		
	}
	 abstract void display();
	 
    void Attack() {
    	System.out.println("Defence Forces are preparing for a coordinated attack.");
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
	Army(){ }
	public Army(String HeadName,int noofvechicle, int budget, int noofdept, int noofmission, String locationofHeadquator,int noofguns, int noofguards, int noofbattalion) {
		super(HeadName, noofvechicle, budget, noofdept, noofmission,locationofHeadquator);
		this.noofguns = noofguns;
		this.noofguards = noofguards;
		this.noofbattalion = noofbattalion;
	}
	void display() {//override
		System.out.println("Noofvechicle is:"+this.noofvechicle); 
		System.out.println("Budget is:"+this.budget);
		System.out.println("Noofdept is:"+this.noofdept);
		System.out.println("Noofmission  is:"+this.noofmission );
		System.out.println("LocationofHeadquator is:"+this.locationofHeadquator);
	    System.out.println("Total Guns: " +this.noofguns);
		System.out.println("Total Guards: "+this.noofguards);
		System.out.println("Battalions: "+this.noofbattalion);
			
		}
	void Attack() {
    	System.out.println("Army attacking on ground using battalions, guns and tanks.");
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
	void display() {//override
		System.out.println("Noofvechicle is:"+this.noofvechicle); 
		System.out.println("Budget is:"+this.budget);
		System.out.println("Noofdept is:"+this.noofdept);
		System.out.println("Noofmission  is:"+this.noofmission );
		System.out.println("LocationofHeadquator is:"+this.locationofHeadquator);
		System.out.println("Total Ships: " +this.noofship);
		System.out.println("Total Submarines: " +this.noofsubmarine);
		System.out.println("Total Torpedoes: "+this.nooftorpedoes );
		
	}
	void Attack() {
    	System.out.println("\"Navy attacking through ocean using warships and submarines.\"");
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
		System.out.println("Noofvechicle is:"+this.noofvechicle); 
		System.out.println("Budget is:"+this.budget);
		System.out.println("Noofdept is:"+this.noofdept);
		System.out.println("Noofmission  is:"+this.noofmission );
		System.out.println("LocationofHeadquator is:"+this.locationofHeadquator);
		System.out.println("Air Missions:"+this.noofmissions);
		System.out.println("Aircraft Count::"+this.nofaircraft);
		System.out.println("Drone Count: "+this.noofdron);
		
	}
	void Attack() {
    	System.out.println("Air Force attacking from sky using jets, bombers and drones.");
    }
	
}
class DefenceOverride{
	 public static void main(String[] args) {
		 Defence d;
		 d=new Army("Lt. General Manoj Pande", 30000, 9000000, 12, 45, 
                 "Delhi HQ", 55000, 8000000, 15);
		 d.display();
		 d.Attack();
		 System.out.println();
		 d=new Navi("Admiral R. Hari Kumar", 15000, 6000000, 6, 22,
                 "Mumbai HQ", 300, 75, 450);
		 d.display();
		 d.Attack();
		 System.out.println();
		 d=new Air("Air Chief VR Chaudhari", 20000, 7000000, 8, 30,"Bangalore HQ", 180, 1200, 7000);
		 d.display();
		 d.Attack();
		 
	}
}

