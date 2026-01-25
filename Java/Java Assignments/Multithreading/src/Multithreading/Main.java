package Multithreading;
public class Main {
public static void main(String[] args) {
	FirstNameReader fr=new FirstNameReader();
	LastNameReader ln=new LastNameReader();
	fr.start();
	ln.start();
}
}
