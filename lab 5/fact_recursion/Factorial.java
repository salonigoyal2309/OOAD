package fact_recursion;

public class Factorial{

	public int calc_fact(int x){
	
		if(x<=0){
			System.out.println("ERROR!");
			return 0;
		}
		
		int ans=1;
		while(x>0){
			ans*=x;
			x-=1;
		}
		
		return ans;
	
	}

}
