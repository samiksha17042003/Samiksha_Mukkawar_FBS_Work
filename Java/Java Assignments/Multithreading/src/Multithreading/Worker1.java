package Multithreading;

public class Worker1 extends Thread {
	public void run() {
		String str="12344244534522561456412555615541";
	    for(int i=0;i<str.length();i++) {
	    	System.out.println(" "+str.charAt(i));
	    }
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}//class worker ends here
class Test1{
	public static void main(String[] args) {
		Worker w1=new Worker();
		w1.start();
		String str="gdgsjcgljsdhcghhfvdhfvkdjhfvhhfjjdhhldhkfvhudk";
	    for(int i=0;i<str.length();i++) {
	    	System.out.println(" "+str.charAt(i));
	    }
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
