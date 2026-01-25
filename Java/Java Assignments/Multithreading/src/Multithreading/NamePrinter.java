package Multithreading;

import java.io.BufferedReader;
import java.io.FileReader;
	class NamePrinter {
	     boolean firstTurn = true; // true → first name prints first

	    public synchronized void printFirst(String fname) throws InterruptedException {
	        while (!firstTurn) {
	            wait();
	        }
	        System.out.print(fname + " ");  // same line
	        firstTurn = false;
	        notifyAll();
	    }

	    public synchronized void printLast(String lname) throws InterruptedException {
	        while (firstTurn) {
	            wait();
	        }
	        System.out.println(lname);      // completes the line
	        firstTurn = true;
	        notifyAll();
	    }
	}


	// Thread for firstname
	class FirstNameReader1 extends Thread {
	    NamePrinter printer;

	    FirstNameReader1(NamePrinter p) {
	        this.printer = p;
	    }

	    @Override
	    public void run() {
	        try {
	            BufferedReader b1 = new BufferedReader(new FileReader(
	                    "src/FirstName.txt"));

	            String name;
	            while ((name = b1.readLine()) != null) {
	                printer.printFirst(name);
	            }
	            b1.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


	// Thread for lastname
	class LastNameReader1 extends Thread {
	    NamePrinter printer;

	    LastNameReader1(NamePrinter p) {
	        this.printer = p;
	    }

	    @Override
	    public void run() {
	        try {
	            BufferedReader b1 = new BufferedReader(new FileReader(
	                    "src/LastName.txt"));

	            String name;
	            while ((name = b1.readLine()) != null) {
	                printer.printLast(name);
	            }
	            b1.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


	// main
	 class TestNames {
	    public static void main(String[] args) {

	        NamePrinter printer = new NamePrinter();

	        FirstNameReader1 t1 = new FirstNameReader1(printer);
	        LastNameReader1  t2 = new LastNameReader1(printer);

	        t1.start();
	        t2.start();
	    }
	}

