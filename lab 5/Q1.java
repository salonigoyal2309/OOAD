import java.util.Scanner;

interface Sports{

	public int get_grace_marks();
		
}

class Student{

	private String name;
	private int roll_no;
	
	public Student(String name,int roll_no){
		this.name = name;
		this.roll_no = roll_no;
	}
	
	public String get_name(){
		return this.name;
	}
	
	public int get_roll_no(){
		return this.roll_no;
	}

}

class Exam extends Student{

	private int marks_scored;
	
	public Exam(String name,int roll_no , int marks_scored){
		super(name,roll_no);
		this.marks_scored = marks_scored;
	}
	
	public int get_marks_scored(){
		return this.marks_scored;
	}

}

class Results extends Exam implements Sports{

	private int total_marks,grace_marks;

	public Results(int total_marks,String name,int roll_no,int marks_scored,int grace_marks){
		super(name,roll_no,marks_scored);
		this.total_marks = total_marks;
		this.grace_marks = grace_marks;
	}
	
	public int get_grace_marks(){
		return this.grace_marks;
	}
	
	public int final_marks(){
		int a = this.get_marks_scored();
		int b = this.get_grace_marks();
		if(total_marks<=a+b){
			return total_marks;
		}
		else{
			return (a+b);
		}
	}
	
}

public class Q1{

	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter name of student : ");
		String name = in.nextLine();
		System.out.println();
		
		System.out.print("Enter total marks:");
		int total_marks = in.nextInt();
		System.out.println();
		
		System.out.print("Enter roll no of student");
		int roll_no = in.nextInt();
		System.out.println();
		
		System.out.print("Enter marks scored in subjects:");
		int marks_scored = in.nextInt();
		System.out.println();
		
		System.out.print("Enter grace marks scored in sports:");
		int grace_marks = in.nextInt();
		System.out.println();
		
		Results x = new Results(total_marks,name,roll_no,marks_scored,grace_marks);
		
		total_marks = x.final_marks();
		System.out.println("Student name : "+x.get_name()+" Roll no : "+x.get_roll_no()+" subject marks : "+x.get_marks_scored()+" grace marks : "+x.get_grace_marks()+" has final score : "+total_marks);
		
	}
}
