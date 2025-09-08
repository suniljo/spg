class Employee 
{
	int empno;
	String name;
	float sal;
	
	Employee(){	}

	Employee(int empno, String name){	
		this.empno = empno;
		this.name = name;
	}

	Employee(int empno, String name, float sal){	
		this(empno, name); //constructor chaining
		this.sal = sal;
	}

	void getDetails(){
		System.out.println(this.empno + " | " + this.name + " | " + this.sal);
	}
} 

class OverloadingConstructors {
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(101, "Valerie");
		Employee emp3 = new Employee(102, "Chris", 2500f);

		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
	}
}
