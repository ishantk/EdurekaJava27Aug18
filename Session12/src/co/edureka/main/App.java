package co.edureka.main;

import java.util.ArrayList;

import co.edureka.db.JDBCHelper;
import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.eid = 0;
		emp1.name = "Ben";
		emp1.exp = 9;
		emp1.salary = 55700;
		emp1.address = "Country Homes";
		
		Employee emp2 = new Employee(7,"Fionna Flynn",6,66000,"Pristine Magnum Apartments");
		
		System.out.println("===emp1 details===");
		System.out.println(emp1);
		System.out.println();
		System.out.println("===emp2 details===");
		System.out.println(emp2);
		
		//DAO
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		//helper.saveEmployee(emp1);
		//System.out.println(">>>><<<<");
		//helper.saveEmployee(emp2);
		
		//helper.updateEmployee(emp2);
		//helper.deleteEmployee(3);
		
		/*ArrayList<Employee> eList = helper.getEmployees();
		for(Employee e : eList){
			System.out.println(e);
		}*/
		
		//helper.executeProcedure(emp1);
		helper.executeBatch();
		
		helper.closeConnection();
	}

}
