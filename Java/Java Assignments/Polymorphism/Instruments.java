package Polymorphism;
class Instruments {
    String InstrumentType;
    String Brande;
    int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getInstrumentType() {
		return InstrumentType;
	}
	public void setInstrumentType(String instrumentType) {
		InstrumentType = instrumentType;
	}
	public String getBrande() {
		return Brande;
	}
	public void setBrande(String brande) {
		Brande = brande;
	}
	Instruments(){
		 InstrumentType="MusicalInstrument";
	      Brande="Not Given";
	     price=0;
	}
	public Instruments(String instrumentName, String brande, int price) {
		super();
		this.InstrumentType = instrumentName;
		this.Brande = brande;
		this.price = price;
	}
	void display() {
		System.out.println("InstrumentName is:"+this.InstrumentType);
		System.out.println("Brande is:"+this.Brande);
		System.out.println("price is:"+this.price );
	}
	void play() {
		System.out.println("The instrument is being played");
	}
}
class Guitor extends Instruments{
	int Stringcount;

	public int getCount() {
		return Stringcount;
	}

	public void setCount(int Stringcount) {
		this.Stringcount = Stringcount;
	}
	Guitor(){
		Stringcount=4;
	}

	public Guitor(String instrumentName, String brande, int price, int Stringcount) {
		super(instrumentName,brande,price);
		this.Stringcount = Stringcount;
	}
	void display() {
		super.display();
		System.out.println("Stringcount is:"+this.Stringcount);
	}
	void play() {
		System.out.println("The guitar is being played");
	}
}
class Piano extends Instruments{
	int keycount;

	public int getKeycount() {
		return keycount;
	}

	public void setKeycount(int keycount) {
		this.keycount = keycount;
	}
	Piano(){
		keycount=32;
	}

	public Piano(String instrumentName, String brande, int price,int keycount) {
		super(instrumentName,brande,price);
		this.keycount = keycount;
	}
	void display() {
		super.display();
		System.out.println("keycount is:"+this.keycount);
	}
	void play() {
		System.out.println("The piano is being played");
	}
}
class Drum extends Instruments{
	int drumsize;

	public int getDrumsize() {
		return drumsize;
	}

	public void setDrumsize(int drumsize) {
		this.drumsize = drumsize;
	}
	Drum(){
		drumsize=50;
	}

	public Drum(String instrumentName, String brande, int price,int drumsize) {
		super(instrumentName,brande,price);
		this.drumsize = drumsize;
	}
	void display() {
		super.display();
		System.out.println("drumsize is:"+this.drumsize);
	}
	void play() {
		System.out.println("The drum is being played");
	}
}
class InstrumentOverride{
	public static void main(String[] args) {
		Instruments i=new Instruments();
		i.display();
		i.play();
		System.out.println();
		i=new Guitor("Acoustic","Yamaha",9000,6);
		i.display();
		i.play();
		System.out.println();
		i=new Piano("Keyboard","Roland",55000,88);
		i.display();
		i.play();
		System.out.println();
		i=new Drum("Acoustic","Tama",60000,22);
		i.display();
		i.play();
		
	}
}