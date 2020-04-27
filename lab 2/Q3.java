class Employee{

	String firstName,lastName;
	int monSalary;
	
	Employee(firstName,lastName,monSalary){
	
		set_firstName(firstName);
		set_lastName(lastName);
		set_monSalary(monSalary);
	
	}
	
	void set_firstName(String firstName){
		this.firstName = firstName;
	}
	
	void set_lastName(String lastName){
		this.lastName = lastName;
	}
	
	void set_monSalary(int monSalary){
		this.monSalary = monSalary;
	}
	
	String get_firstName(){
		return firstName;
	}
	
	String get_lastName(){
		return lastName;
	}
	
	int get_monSalary(){
		return this.monSalary;
	}
	
		

}

public class Q3{

	public static void main(String[] args){
		
		Employee e1 = new Employee('A','B',1500);
		Employee e2 = new Employee('C','D',180);
			
	}
	
}
