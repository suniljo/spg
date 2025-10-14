class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Sanjay Patil";
		sal = 5000.75f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}

	public static void main(String[] args) 
	{
		System.out.println("in Employee class");
	}
} //Employee

class ObjectTest {
	public static void main(String[] args) 
	{
		//creating an instance of Employee type
		Employee emp = new Employee();
		
		//access the properties of an object using reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//access the properties of an object using reference and method
		emp.getDetails();

		//change the state of an object using reference
		emp.empno = 101;
		emp.name = "Sanjay";
		emp.sal = 2500.5f;
		emp.getDetails();

		//change the state of an object using reference & method
		emp.setDetails();
		emp.getDetails();
	}
}
