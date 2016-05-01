import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeLogFunctions {
	
	Scanner in = new Scanner(System.in);


	/*
	 * Constructs an empty HashMap with the default initial capacity (16) and 
	 * the default load factor (0.75).
	 */
	//Should I be using private static final? is the final really necessary?
	private static final 
	HashMap<Integer, Employee> EMPLOYEES = new HashMap<Integer, Employee>();
	Employee employee;

	public EmployeeLogFunctions(){

	}

	

	public void addEmployeeTest(){
		
		employee = new Employee();
		employee.setId(111);
		employee.setFirstName("Lex");
		employee.setLastName("Luther");
		EMPLOYEES.put(111, employee);

		employee = new Employee();
		employee.setId(222);
		employee.setFirstName("Bruce");
		employee.setLastName("Wayne");
		EMPLOYEES.put(222, employee);

		employee = new Employee();
		employee.setId(333);
		employee.setFirstName("Clark");
		employee.setLastName("Kent");
		EMPLOYEES.put(333, employee);

		
	}
	
	
	public boolean addEmployee(){
		
		int idTemp = 0;
		String firstNameTemp;
		String lastNameTemp;
		
		System.out.println("Adding new employee...");
		System.out.println("Enter ID of choice. Must be 3 digits");
		
		idTemp = in.nextInt();
		
		/*
		 * If the Id has already been assigned, loop until a valid Id is Entered.
		 * Should have a cancel feature in GUI version. (Would replace 'if' block).
		 */
		while(this.employeeIdExists(idTemp)){
			System.out.println("Id in use. Enter new Id.");
			idTemp = in.nextInt();
			
			if(idTemp==0){
				//Cancel addEmployee request;
				System.out.println("addEmployee ancelled");
				return false;
			}
		}
		
		System.out.println("Enter first name: ");
		firstNameTemp = in.next();
		
		System.out.println("Enter last name: ");
		lastNameTemp = in.next();
		
		/*
		 * Create a new Employee instance and fulfill its attributes.
		 */
		employee = new Employee();
			employee.setId(idTemp);
			employee.setFirstName(firstNameTemp);
			employee.setLastName(lastNameTemp);
		
		/*
		 * Add the Employee instance to the HashMap, using its id as the Key.
		 */
		EMPLOYEES.put(idTemp, employee);
		
		return true;

	}
	
	public boolean deleteEmployee(){
		int idTemp = 0;
		System.out.println("Deleting employee...");
		System.out.println("Please enter employee Id: ");
		
		idTemp = in.nextInt();
		
		if(this.employeeIdExists(idTemp)){
			EMPLOYEES.remove(idTemp);
			return true;
			
		}
		else return false;
	}
	
	
	/*
	 * Check to see if the employee Id is already assigned, returns true if 
	 * already assigned.  
	 */
	public boolean employeeIdExists(int employeeId){
		if(EMPLOYEES.containsKey(employeeId)){
			return true;
		}
		else return false;
	}

	
	/*
	 * Iterator through HashMap, calling each values toString. 
	 */
	public void printEmployeeList(){
		Iterator<Integer> employeeKeyIterator = EMPLOYEES.keySet().iterator();
		while(employeeKeyIterator.hasNext()){
			int x = employeeKeyIterator.next();
			System.out.println(EMPLOYEES.get(x).toString());
		}
	}


}
