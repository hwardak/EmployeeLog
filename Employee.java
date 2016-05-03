
public class Employee {
	
	private String firstName;	
	private String lastName;	
	private int id;	
	
	//isOn is a reference to whether the employee in question is on duty or not. 
	private boolean isOn;

	
	public Employee() {

	}
	
	//Do I need this initial constructor if I have the setId(int id) method? 
	//Which one is better to use?
	public Employee(int id){
		this.id = id;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
	}
	
	

}
