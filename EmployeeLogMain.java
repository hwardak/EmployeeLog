import java.time.LocalDateTime;
import java.util.Scanner;

public class EmployeeLogMain {

	Scanner in = new Scanner(System.in);
	EmployeeLogFunctions functions = new EmployeeLogFunctions();
	ClockFunctions clock = new ClockFunctions();
	LocalDateTime time = LocalDateTime.now();

	public EmployeeLogMain() {
		this.menu();
	}

	private void menu() {
		int option = 0;

		do{
			time = LocalDateTime.now();
			System.out.println(time.getHour() +":"+ time.getMinute());
		
			
			System.out.println("Menu...");

			System.out.println("1. Add Employee.");
			System.out.println("2. Add Employee (Test).");
			System.out.println("3. Delete Employee."); 
			System.out.println("4. Print Employee List."); 
			System.out.println("");
			System.out.println("5. Sign-In/Out.");
			System.out.println("");
			System.out.println("0. Quit.");

			option = in.nextInt();

			switch (option) {
			case 1:  
				if(functions.addEmployee()){
					System.out.println("Add employee successful.");
				}
				else {
					System.out.println("Add employee fail..");
				}
				break;

			case 2:
				functions.addEmployeeTest();
				break;

			case 3:
				if(functions.deleteEmployee()){
					System.out.println("Delete employee successful.");
				}
				else {
					System.out.println("Delete employee fail..");
				}
				break;

			case 4:
				functions.printEmployeeList();
				break;
			}
		}while(option !=0);
	}
}
