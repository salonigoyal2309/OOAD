import java.util.Scanner;
import java.util.Arrays; 

class IntegerSet{

	boolean[] num = new boolean[101];
	
	public IntegerSet(){
			for(int i=0;i<101;i++){
				this.num[i]=false;
			}
	}
	
	private boolean check(int x){
	
		if(x<0 || x>100){
			System.out.println("x range out of bound[0,100]");
			return false;
		}
		else{
			return true;
		}
	
	}
	
	public void deleteElement(int x){
		
		if(!check(x)) return;
		
		if(this.num[x]){
			System.out.println(x+" deleted successfully");
			this.num[x]=false;
		}
		else{
			System.out.println(x+" not present in the given set");
		}
		
	}
	
	public void insertElement(int x){
		
		if(!check(x)) return;
		
		if(!this.num[x]){
			System.out.println(x+" inserted successfully");
			this.num[x]=true;
		}
		else{
			System.out.println(x+" already present in the given set");
		}
		
	}
	
	public void toSetString(){
	
		String s ="";
		
		for(int i=0;i<101;i++){
		
			if(this.num[i]){
				s+=Integer.toString(i);
				s+=" ";
			}
		}
		
		if(s==""){
			s="---";
		}
		
		System.out.println(s);
		
	}
	

}

class Q2{

	
	public static void Union(IntegerSet a,IntegerSet b){
	
		IntegerSet tmp = new IntegerSet();
		
		for(int i=0;i<101;i++){
		
			if(a.num[i]||b.num[i]) tmp.num[i]=true;
		
		}
		
		System.out.println("After union : ");
		tmp.toSetString();
		
	
	}
	
	public static void Intersect(IntegerSet a,IntegerSet b){
	
		IntegerSet tmp = new IntegerSet();
		
		for(int i=0;i<101;i++){
		
			if(a.num[i] && b.num[i]) tmp.num[i]=true;
		
		}
		
		System.out.println("After intrsection : ");
		tmp.toSetString();
		
	
	}
	
	public static void isEqualTo(IntegerSet a,IntegerSet b){
	
		IntegerSet tmp = new IntegerSet();
		
		for(int i=0;i<101;i++){
		
			if((a.num[i] && !b.num[i])||(!a.num[i] && b.num[i])){
				System.out.println("Not equal");
				return;
			}
		
		}
		
		System.out.println("Equal");
		
	
	}
	
	public static void main(String args[]){
      
      IntegerSet i1 = new IntegerSet();
      IntegerSet i2 = new IntegerSet();
      
      i1.insertElement(2);
      i1.insertElement(55);
      i1.insertElement(7);
      i1.insertElement(99);
      i1.insertElement(100);
      i1.insertElement(0);
      
	  i2.insertElement(6);
	  i2.insertElement(2);
	  i2.insertElement(100);
	  i2.insertElement(25);
	  
	  i1.toSetString();
	  i2.toSetString();
	  
	  Union(i1,i2);
	  Intersect(i1,i2);
	  
	  i2.deleteElement(6);
	  i2.deleteElement(2);
	  i2.deleteElement(100);
	  i2.deleteElement(25);
	  
	  i2.toSetString();
	  
	  isEqualTo(i1,i2);
	  
	  i2.insertElement(2);
      i2.insertElement(55);
      i2.insertElement(7);
      i2.insertElement(99);
      i2.insertElement(100);
      i2.insertElement(0);
      
      isEqualTo(i1,i2);
		
    }
}

