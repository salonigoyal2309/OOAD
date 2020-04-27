import java.util.Scanner;
import java.io.*;

class SavingsAccount{

	static double annualInterestRate;
	private double savingsBalance;

	public SavingsAccount(double savingsBalance){
		this.savingsBalance = savingsBalance;
	}

	public double calculateMonthlyInterest(){
		double x = (savingsBalance*annualInterestRate)/1200;
		return savingsBalance+x;
	}

	public static void modifyInterestRate(double annualInterestRate1){
		annualInterestRate = annualInterestRate1;
	}	

}

class q2 {
    public static void main(String args[]) {

	SavingsAccount saver1 = new SavingsAccount(2000);
	SavingsAccount saver2 = new SavingsAccount(3000);

	saver1.modifyInterestRate(4);
	
	System.out.println("saver1 calculateMonthlyInterest : "+saver1.calculateMonthlyInterest());
	System.out.println("saver2 calculateMonthlyInterest : "+saver2.calculateMonthlyInterest());

	saver1.modifyInterestRate(5);

	System.out.println("savingsBalance turned to 5% ");

	System.out.println("saver1 calculateMonthlyInterest : "+saver1.calculateMonthlyInterest());
	System.out.println("saver2 calculateMonthlyInterest : "+saver2.calculateMonthlyInterest());

    }
}
