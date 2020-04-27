import java.util.Scanner;
import java.io.*;

class Rectangle{

	private double length,width;
	
	public Rectangle(){
		this.length = 1;
		this.width = 1;
	}

	
	public Rectangle(double length,double width){
		this.set_length(length);
		this.set_width(width);
	}

	public void set_length(double length){
		if(length>0.0 && length<20.0){
			this.length = length;
		}
		else{
			this.length=1;
		}
	}

	public void set_width(double width){
		if(width>0.0 && width<20.0){
			this.width = width;
		}
		else{
			this.width=1;
		}
	}

	public double get_length(){
		return this.length;
	}

	public double get_width(){
		return this.width;
	}

	public double area(){
		return (this.length)*(this.width);
	}

	public double perimeter(){
		return 2*((this.length)+(this.width));
	}

}

class q1 {
    public static void main(String args[]) {

	Rectangle a = new Rectangle();
	Rectangle b = new Rectangle(10.3,15.9);
	Rectangle c = new Rectangle(20.5,3);

	System.out.println("a's length : "+a.get_length()+" width : "+a.get_width()+" Area : "+a.area()+" Perimeter : "+a.perimeter() );
	System.out.println("b's length : "+b.get_length()+" width : "+b.get_width()+" Area : "+b.area()+" Perimeter : "+b.perimeter() );
	System.out.println("c's length : "+c.get_length()+" width : "+c.get_width()+" Area : "+c.area()+" Perimeter : "+c.perimeter() );

	c.set_length(7.5);

	System.out.println("c's length : "+c.get_length()+" width : "+c.get_width()+" Area : "+c.area()+" Perimeter : "+c.perimeter() );

    }

}
