package Multithreading;

import java.io.FileWriter;
import java.io.IOException;
class Test4{
	public static void main(String[] args) {
		 try {
			FileWriter fw=new FileWriter("Demo.txt",true);
			fw.write("\nFirstbitsolution");
			fw.close();
			System.out.println("Written Successfully!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
