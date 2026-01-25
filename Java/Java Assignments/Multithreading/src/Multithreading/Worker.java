package Multithreading;

public class Worker extends Thread{

	public void run() {
		String str="12344244534522561456412555615541";
	    for(int i=0;i<str.length();i++) {
	    	System.out.println(" "+str.charAt(i));
	    }
	}
}//class worker ends here
class Test{
	public static void main(String[] args) {
		Worker w1=new Worker();
		w1.start();
		String str="gdgsjcgljsdhcghdhhssvhzfdhvidhfivfdhvidfviu";
	    for(int i=0;i<str.length();i++) {
	    	System.out.println(" "+str.charAt(i));
	    }
	}
}