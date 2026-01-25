package Multithreading;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main1 {
	
	 public static void main(String[] args) {
		 new Thread(new Runnable() {

			public void run() {
				try {
					 BufferedReader b1=new BufferedReader(new FileReader("src/FirstName.txt"));
					 String fname=null;
					 while((fname=b1.readLine())!=null){
						 System.out.println(fname);
					 }
				 }
					 catch(FileNotFoundException f) {
						 
						 f.printStackTrace();
						}
					 catch(IOException e){
							e.printStackTrace();
						}
				
			}
		 
	 }).start();
		 new Thread(new Runnable() {
				 public void run() {
					 try {
					 BufferedReader b1=new BufferedReader(new FileReader("src/LastName.txt"));
					 String lname=null;
					 while((lname=b1.readLine())!=null){
						 System.out.println(lname);
					 }
				 }
					 catch(FileNotFoundException f) {
						 f.printStackTrace();
						}
					 catch(IOException e){
							e.printStackTrace();
						}
				}
		 }).start();
	 }
		 public static void main1(String[] args) {
    
        // -------- Anonymous class for FirstNameReader --------
        Thread firstNameThread = new Thread() {
            public void run() {
                try {
                    BufferedReader br = new BufferedReader(new FileReader("src/FirstName.txt"));
                    String fname;
                    while ((fname = br.readLine()) != null) {
                        System.out.println(fname);
                    }
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        // -------- Anonymous class for LastNameReader --------
        Thread lastNameThread = new Thread() {
            public void run() {
                try {
                    BufferedReader br = new BufferedReader(new FileReader("src/LastName.txt"));
                    String lname;
                    while ((lname = br.readLine()) != null) {
                        System.out.println(lname);
                    }
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        // Start both threads
        firstNameThread.start();
        lastNameThread.start();
    }
}
