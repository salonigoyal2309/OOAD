import java.util.Scanner;
import java.util.Arrays; 

class Complex{

	private float real , imaginary;
	
	public Complex(){
		real=0;
		imaginary=0;
	}
	
	public Complex(float real , float imaginary){
	
		this.real = real;
		this.imaginary = imaginary;
	
	}	
	
	public void set_real(float real){
		this.real = real;
	}
	
	public void set_imaginary(float imaginary){
		this.imaginary = imaginary;
	}
	
	public float get_real(){
		return this.real;
	}
	
	public float get_imaginary(){
		return this.imaginary;
	}
	
	
}


class Q1{


	public static void add(Complex c1,Complex c2){
	
		float r = c1.get_real()+c2.get_real();
		float i = c1.get_imaginary()+c2.get_imaginary();
		
		System.out.println("("+r+","+i+")");
		
	}
	
	public static void subtract(Complex c1,Complex c2){
	
		float r = c1.get_real()-c2.get_real();
		float i = c1.get_imaginary()-c2.get_imaginary();
		
		System.out.println("("+r+","+i+")");
		
	}
	
	public static void print(Complex c){
	
		float r = c.get_real();
		float i = c.get_imaginary();
		
		System.out.println("("+r+","+i+")");
		
	}

	public static void main(String args[]){
      
		Complex c1 = new Complex();
		Complex c2 = new Complex(12.66f,10);
		Complex c3  = new Complex(10,30);
		
		add(c2,c3);
		subtract(c3,c2);
		print(c1);
		
		
    }
}

