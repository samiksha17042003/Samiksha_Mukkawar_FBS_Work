package Controller;

import p1.Employee;

public class EmployeeController {
       EmployeeDAO eDAO=new EmployeeDAO();
	public void addEmployee(Employee e) {
		try {
			if(eDAO.addEmployee(e)) {
				System.out.println("Employee Added Successfull!!!");
			}else {
				System.out.println("Array is Full!!");
			}
		} 
		catch (InvalideIDException e1) {
			//e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		catch (StringValidateException e1) {
			//e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		catch (InvalidSalaryException e1) {
			//e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		catch ( DuplicateEmployeeException e1) {
			//e1.printStackTrace();
			System.out.println(e1.getMessage());
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
		try {
			if(eDAO.updateEmployee(id,salary)) {
			return true;
}
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	public void sortEmployee(int choice) {
		eDAO.Employeesort(choice);
	}
}
