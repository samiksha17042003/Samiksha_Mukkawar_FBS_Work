package Inheritance;

public class Instrument {
     String InstrumentName;
     String Brande;
     int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getInstrumentName() {
		return InstrumentName;
	}
	public void setInstrumentName(String instrumentName) {
		InstrumentName = instrumentName;
	}
	public String getBrande() {
		return Brande;
	}
	public void setBrande(String brande) {
		Brande = brande;
	}
	Instrument(){
		 InstrumentName="MusicalInstrument";
	      Brande="Casio";
	     price=3000;
	}
	public Instrument(String instrumentName, String brande, int price) {
		super();
		this.InstrumentName = instrumentName;
		this.Brande = brande;
		this.price = price;
	}
	void display() {
		System.out.println("InstrumentName is:"+this.InstrumentName);
		System.out.println("Brande is:"+this.Brande);
		System.out.println("Price is:"+this.price );
	}
}
class Guitor extends Instrument{
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
	
}
class Piano extends Instrument{
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
		System.out.println("Keycount is:"+this.keycount);
	}
}
class Drum extends Instrument{
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
		System.out.println("Drumsize is:"+this.drumsize);
	}
}
class TestInstrument{
	public static void main(String[] args) {
		Guitor g=new Guitor("Acoustic","Yamaha",9000,6);
		g.display();
		System.out.println();
		Piano p=new Piano("Keyboard","Roland",55000,88);
		p.display();
		System.out.println();
		Drum d=new Drum("Acoustic","Tama",60000,22);
		d.display();
	}
}
