package lessons.revision;

public class Employee {
	//instance variables for id, name, position, department, company, salary
	private int id;
	private String name, position, department, company;
	private double salary;
	
    //constructor with 4 parameters, except id and department
    //inside the constructor generate a random number between 1 and 100 as ID number
    //inside the constructor provide a message for department "Department not yet assigned";
	public Employee(String name, String position, String company, double salary) {
		this.name = name;
		this.position = position;
		this.company = company;
		this.salary = salary;
		this.id = (int) (Math.random() * 100) + 1;
		this.department = "Department not yet assigned";
	}

	//declare Methods setters and getters for department, position, salary
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//Override all toString method for better explanation about our object
	//Source-generate-toString()
	//this is similar to the get
	//it's overriding our constructor
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", department=" + department
				+ ", company=" + company + ", salary=" + salary + "]";
	}
	
}//end class
