package studyguide2;

import java.util.Arrays;

//Employee.  class should implement the interface EmployeeInterface.
public class Employee implements EmployeeInterface{
	// 1. Class Employee should have the variable int[ ] empIDs. The 1-based index of a employee
	// is the employee's ID.
	private int[] empIDs;

	// Employee( ): Initialize the empty array empIDs to store 11 integer values. Assign the
	// value 1 to each element in empIDs. Print "A new JIRA team has been formed".
	Employee() {
		empIDs = new int[11];
		Arrays.fill(empIDs, 1);
		System.out.println("A new JIRA team has been formed");
	}

	@Override
	// void calculateAvgAge(int[] age): age contains the age of every Employee. Print the average
	// age of the jira team with two digits after the decimal in the form
	// "The average age of the JIRA team is {avgAge}".
	public void calculateAvgAge(int[] age) {
		// TODO Auto-generated method stub
		int size = age.length;
		double sum = 0;
		for(int eachAge : age) {
			sum += eachAge;
		}
		double average = sum / size;

		System.out.println("The average age of the JIRA team is " + String.format("%.2f", average));
	}

	// void promoteEmployee(int id): Assign -1 to empIds[id].  Print "Employee with id: {id} has
	// promoted!!". If the emp has already been promoted, print "Employee {id} has already been promoted".
	@Override
	public void promoteEmployee(int id) {
		// TODO Auto-generated method stub
		int targetEmployeeValue = empIDs[id - 1];
		if (targetEmployeeValue != -1) {
			empIDs[id - 1] = -1;
			System.out.println("Employee with id: " + id + " has promoted!!");
		} else {
			System.out.println("Employee " + id + " has already been promoted");
		}
		
	}

}
