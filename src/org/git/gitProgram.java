package org.git;



public class gitProgram {
	private void employeename()  {
		
		System.out.printf("Employee name: Tamil");
	}
	private void employeeId() {
		
		System.out.printf("Employee ID: 02508");
	}
	private void employeedob() {
		
		System.out.println("Employee DOB: 18/05/1998");
	}
	private void employeephone() {
		System.out.println(" Employee Phone: 8867229453");
	}
	private void employeeemail() {
		System.out.println("Employee Email: vijay@gmail.com");
	}
	private void employeeaddress() {
		System.out.println("Employee address: 56-RSR Road, RS puram, coimbatore");
	}
	
	public static void main(String[] args) {
		gitProgram e = new gitProgram();
		e.employeename();
		e.employeeId();
		e.employeedob();
		e.employeephone();
		e.employeeemail();
		e.employeeaddress();
		
}
}