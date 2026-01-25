package Controller;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import p1.Admin;
import p1.Employee;
import p1.HR;
import p1.SalesManager;

public class EmployeeDAO {
	ArrayList<Employee> a1=new ArrayList<Employee>();
	public EmployeeDAO(){
	//ArrayList<Employee> a1=new ArrayList<Employee>();
//	a1.add(new HR(101, "Ranjit", 50000, 5000));
//	a1.add(new HR(102, "Amit", 48000, 4500));
//	a1.add(new HR(103, "Sneha", 47000, 4000));
//	a1.add(new SalesManager(201, "Karan", 60000, 12, 8000));
//	a1.add(new SalesManager(202, "Meena", 58000, 15, 7500));
//	a1.add(new SalesManager(203, "Rohit", 62000, 10, 9000));
//	a1.add(new Admin(301, "Pragati", 70000, 10000));
//	a1.add(new Admin(302, "Isha", 68000, 9500));
//	a1.add(new Admin(303, "Pooja", 72000, 11000));
//	a1.add(new Admin(304, "Shubham", 75000, 12000));
	//}
	try {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Empdata.txt"));//read the object
		a1=(ArrayList<Employee>)ois.readObject();//read the object from Employee arraylist
		//read the data from text file
		//System.out.println("Written Successfully!");
		ois.close();
	}catch(ClassNotFoundException|IOException e) {
		System.out.println("File not found!!");
	}	
	}
	
	public boolean addEmployee(Employee e) throws InvalideIDException,StringValidateException,InvalidSalaryException,DuplicateEmployeeException{
		// Validate ID (only integers allowed)
        if (e.getId() <= 0) {
            throw new InvalideIDException();
        }
     // Validate Salary (only integers allowed)
		if (e.getName().matches(".*\\d.*")) {
        throw new StringValidateException();
     }
		// Check duplicate ID
		if (e.getSalary()<= 0||e.getSalary()%1 != 0) {
            throw new InvalidSalaryException();
	}
		for(Employee e1:a1) {
			if(e1!=null&&e1.getId()==e.getId()) {
				 throw new DuplicateEmployeeException();
			}
	}
	a1.add(e);
	save();
	return true;
	}

	public Employee searchEmployeeById(int id) {	
		for(Employee e:a1) {
			if(e.getId()==id)
			{
				return e;
			}		
		}
		return null;
		}
	
	public boolean updateEmployee(int id, double salary)throws InvalidSalaryException{
		if (salary < 0)
            throw new InvalidSalaryException();
		
		    for(Employee e:a1) {
            if (e.getId() == id) {
            	e.setSalary(salary);
                return true;
            }
        }
        return false;
	}
	
	public boolean deleteEmployee(int id) {
		for (int i = 0; i <a1.size(); i++) {
            if (a1.get(i).getId() == id) {
            a1.remove(i);
            return true;
     
                }
	}
		return false;
	}
	public void displayAll() {
	System.out.println(a1);
    }
	
	public class MyIDComparator implements Comparator<Employee>
	{
		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.getId() - o2.getId();
		}
	}
	
	public class MySalaryComparator implements Comparator<Employee>
	{
		public int compare(Employee o1, Employee o2) {
		
			return (int) (o1.getSalary()-o2.getSalary()); //casting double to int //Ascending sorting
		}
	}
	
	public class MyNameComparator implements Comparator<Employee>
	{
			@Override
			public int compare(Employee o1, Employee o2) {
			
				return o1.getName().compareTo(o2.getName());
			}
	}
	
   public void Employeesort(int choice) {
	   switch(choice) {
	   case 1:{
		   MyIDComparator mid=new MyIDComparator();
		   Collections.sort(a1,mid);
		   break;
	   }
	   case 2:{
		   MySalaryComparator msc=new MySalaryComparator();
		   Collections.sort(a1,msc);
		   break;
	   }
	   case 3:{
		   MyNameComparator mn=new MyNameComparator();
		   Collections.sort(a1,mn);
		   break;
	   }
	   default:
		   throw new IllegalArgumentException("Unexpected Value:"+choice);
	}
   System.out.println(a1);
}
   public void save() {//function only write the data from txt file
	   try {
		    ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Empdata.txt"));
			oos.writeObject(a1);//write the object from Employee arraylist
			oos.close();
		}
	   catch(FileNotFoundException e){
			e.printStackTrace();
		}
	   catch(IOException e){
			e.printStackTrace();
		}
	   } 
   }
