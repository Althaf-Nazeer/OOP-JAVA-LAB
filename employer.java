class Employee {
	void display() {
		System.out.println("Name of class in Employee");
	}

	void calcSalary() {
		System.out.println("Salary of employee is 10000");
	}
}

class Engineer extends Employee {
	void calcSalary() {
		System.out.println("Salary of engineer is 20000");
	}
}

class Employer {
	public static void main(String args[]) {
		Engineer obj = new Engineer();
		obj.display();
		obj.calcSalary();
	}
}
