package Controller;

import p1.Admin;
import p1.Employee;
import p1.HR;
import p1.SalesManager;

public class EmployeeDAO {
	static Employee[] eArr;
	static int count=0;
	static {
		eArr=new Employee[20];
		count=0;
		eArr[count++] = new HR(101, "Ranjit", 50000, 5000);
	    eArr[count++] = new HR(102, "Amit", 48000, 4500);
	    eArr[count++] = new HR(103, "Sneha", 47000, 4000);
	    eArr[count++] = new SalesManager(201, "Karan", 60000, 12, 8000);
	    eArr[count++] = new SalesManager(202, "Meena", 58000, 15, 7500);
	    eArr[count++] = new SalesManager(203, "Rohit", 62000, 10, 9000);
	    eArr[count++] = new Admin(301, "Pragati", 70000, 10000);
	    eArr[count++] = new Admin(302, "Isha", 68000, 9500);
	    eArr[count++] = new Admin(303, "Pooja", 72000, 11000);
	    eArr[count++] = new Admin(304, "Shubham", 75000, 12000);
	}
	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		if(count<eArr.length) {
			eArr[count++] = e;
			return true;
		}
		return false;
		
		
	}
	public Employee searchEmployeeById(int id) {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++) {
            if (eArr[i].getId() == id) {
                return eArr[i];
            }
        }
        return null;
		
		
	}
	public boolean updateEmployee(int id, double salary) {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++) {
            if (eArr[i].getId() == id) {
            	eArr[i].setSalary(salary);
                return true;
            }
        }
        return false;
	}
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++) {
            if (eArr[i].getId() == id) {
                for (int j = i; j < count; j++) {
                    eArr[j] = eArr[j + 1];
                }
                eArr[--count] = null;
                return true;
            }
        }
        return false;
	}
	public void displayAll() {
		// TODO Auto-generated method stub
				for (int i = 0; i < count; i++) {
					System.out.println(eArr[i]);
		           }
	}
	
	
	
}
