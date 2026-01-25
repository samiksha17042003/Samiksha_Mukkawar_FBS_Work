package Controller;

import p1.Employee;

public class EmployeeController {
       EmployeeDAO eDAO=new EmployeeDAO();
	public void addEmployee(Employee e) {
		if(eDAO.addEmployee(e)) {
			System.out.println("Successfull!!!");
		}else {
			System.out.println("Array is Full!!");
		}
	}

	public Employee searchEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee e1=eDAO.searchEmployeeById(id);
		if(e1!=null) {
			return e1;
		}
		return null;
	}
	
	public boolean updateEmployee(int id, double salary) {
		// TODO Auto-generated method stub
		if(eDAO.updateEmployee(id,salary)) {
		return true;
	}
	return false;
}
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		if(eDAO.deleteEmployee(id)) {
		return true;
		}
		return false;
	}

	public void displayAll() {
		eDAO.displayAll();
		// TODO Auto-generated method stub
		
	}

	

}
