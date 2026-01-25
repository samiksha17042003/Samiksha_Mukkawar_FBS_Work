package Multithreading;

public class Worker2 implements Runnable{

	public void run() {
		String str="12344244534522561456412555615541";
	    for(int i=0;i<str.length();i++) {
	    	System.out.println(" "+str.charAt(i));
	    }
	}
}//class worker ends here
class Test3{
	public static void main(String[] args) {
		Worker2 w1=new Worker2();
		Thread t1=new Thread(w1);
		t1.start();
		String str="gdgsjcgljsdhcghdhhssvhzfdhvidhfivfdhvidfviu";
	    for(int i=0;i<str.length();i++) {
	    	System.out.println(" "+str.charAt(i));
	    }
	}
}