package ToString;

public class Defence {
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
	public String toString(){
		return "HeadName is:"+this.HeadName+"\nTotalVechicle is:"+this.noofvechicle+"\nBudget is:"+this.budget+"\nTotaldept is:"+this.noofdept+"\nTotalMission  is:"+this.noofmission+"\nLocationofHeadquator is:"+this.locationofHeadquator; 
	 }
    void Attack() {
    	System.out.println("");
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
	public String toString(){
		return super.toString()+"\nTotal Guns:" +this.noofguns+"\nTotal Guards:"+this.noofguards+"\nBattalions:"+this.noofbattalion; 
	 }
	void Attack() {
    	System.out.println("Defence Forces are preparing for a coordinated attack.");
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
	public String toString(){
		return super.toString()+"\nTotal Ships:"+this.noofship+"\nTotal Submarines:" +this.noofsubmarine+"\nTotal Torpedoes: "+this.nooftorpedoes; 
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
	public String toString(){
		return super.toString()+"\nAir Missions:"+this.noofmissions+"\nAircraft Count:"+this.nofaircraft+"\nDrone Count: "+this.noofdron; 
	 }
	
	void Attack() {
    	System.out.println("Air Force attacking from sky using jets, bombers and drones.");
    }
	
}
class Test7{
	 public static void main(String[] args) {
		 Defence d=new  Defence();
		 d=new Army("Lt. General Manoj Pande", 30000, 9000000, 12, 45, 
                 "Delhi HQ", 55000, 8000000, 15);
		 System.out.println(d);
		 d.Attack();
		 System.out.println();
		 d=new Navi("Admiral R. Hari Kumar", 15000, 6000000, 6, 22,
                 "Mumbai HQ", 300, 75, 450);
		 System.out.println(d);
		 d.Attack();
		 System.out.println();
		 d=new Air("Air Chief VR Chaudhari", 20000, 7000000, 8, 30,"Bangalore HQ", 180, 1200, 7000);
		 System.out.println(d);
		 d.Attack();
		 
	}
}

