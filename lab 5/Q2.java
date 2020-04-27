import java.util.Scanner;

class Person{

	String name,hobby="Reading";
	
	public Person(String name){
		this.name = name;
	}
	
	public String get_name(){
		return this.name;
	}

	public void introduce(){
		System.out.println("Hello, my name is " + this.get_name()+" and my hobby is "+this.hobby);
	}

}

class Student extends Person{

	String hobby = "Facebook";
	
	public Student(String name){
		super(name);
	}
	
	public void introduce(){
		System.out.println("Hello, my name is " + this.get_name()+" and my hobby is "+this.hobby);
	}
	
	public void Person_introduce(){
		super.introduce();
	}

}

class CSEStudent extends Student{

	String hobby = "Hacking";
	
	
	public CSEStudent(String name){
		super(name);
	}
	
	public void introduce(){
		System.out.println("Hello, my name is " + this.get_name()+" and my hobby is "+this.hobby);
	}
	
	public void Student_introduce(){
		super.introduce();
	}
	
	public void Person_introduce(){
		super.Person_introduce();
	}

}

public class Q2{

	public static void main(String[] args){
		
		CSEStudent a = new CSEStudent("Varun");
		Scanner in  = new Scanner(System.in);
		
		while(true){
		
			System.out.println("Enter case from 1 , 2 and 3 : ");
			int x = in.nextInt();
			
			switch(x){
			
				case 1 : 
					System.out.println("--- At a get-together for student leaders of various colleges in Jaipur ---");
					a.Person_introduce();
					break;
				case 2 :
					System.out.println("--- At his cousin's birthday party where he meets a beautiful girl who is a Tagore fan");
					a.Student_introduce();
					break;
				case 3 :
					System.out.println("--- At a closed-door Hacker Society meeting ---");
					a.introduce();
					break;
				default : 
					System.out.println("chose number from 1 , 2 and 3");
			}
			
		}
	
		
		
	}

}
