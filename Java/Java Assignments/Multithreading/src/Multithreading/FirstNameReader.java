package Multithreading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FirstNameReader extends Thread {
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
}
