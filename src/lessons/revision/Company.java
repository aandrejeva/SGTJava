package lessons.revision;

public class Company {

	public static void main(String[] args) {
		//declare and create 3 objects(as a employee1,2,3) and set parameters
		Employee employee1 = new Employee("Mark", "manager", "FFL", 1445.55);
		Employee employee2 = new Employee("Luca", "analyst", "OAK", 1305.95);
		Employee employee3 = new Employee("Esther", "assistant", "FOU", 995.04);
		
		double employee1OriginalSalary = employee1.getSalary();
		double employee2OriginalSalary = employee2.getSalary();
		double employee3OriginalSalary = employee3.getSalary();
		
        //set department for your employees
		employee1.setDepartment("Logistics");
		employee2.setDepartment("Logistics");
		employee3.setDepartment("Administration");
		
        System.out.println("After 1 year inside the company:");
        
        //set to change your employee promotion from position to salary
        employee1.setPosition("senior manager");
        employee1.setSalary(1650.09);
        
        employee2.setPosition("senior analyst");
        employee2.setSalary(1497.04);
        
        employee3.setPosition("junior analyst");
        employee3.setSalary(1095.53);
        
        //calculate employees salary difference after 1 year and store in new variables of type Double (non - primitive data type)
        Double employee1SalaryDiff = employee1.getSalary() - employee1OriginalSalary;
        Double employee2SalaryDiff = employee2.getSalary() - employee2OriginalSalary;
        Double employee3SalaryDiff = employee3.getSalary() - employee3OriginalSalary;
      
        //out print your employees (in addition the difference of salaries after promotion)
        System.out.println(employee1.toString() + " salary difference after promotion " + employee1SalaryDiff.floatValue());
        System.out.println(employee2.toString()+ " salary difference after promotion " + employee2SalaryDiff.floatValue());
        System.out.println(employee3.toString()+ " salary difference after promotion " + employee3SalaryDiff.floatValue());

	}//end main

}//end class
