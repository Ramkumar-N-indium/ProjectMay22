package basics;

public class Employee {
	String empId;
	String empName;
	int age;
	float salary;
	static String companyName="Indium";
	public Employee(String empId,String empName,int age,float salary) {
		this.empId=empId;
		this.empName=empName;
		this.age=age;
		this.salary=salary;
	}
	
	public void empDetails() {
		System.out.println("Id: "+empId+", Name: "+empName+", Age: "+age+", Salary: "+salary
				+", Company name: "+companyName);
	}

}