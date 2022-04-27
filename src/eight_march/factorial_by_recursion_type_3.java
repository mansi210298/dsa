package eight_march;

public class factorial_by_recursion_type_3 {
	
	public static void main(String[] args)
	{
		System.out.println(fact(5));
		
	}
	
	public static int fact(int n)    //n=5 which is factorial to be determined
	{
		//base condition
		if(n==1)
		{
			return 1;
		}
		
		int smaller_fact=fact(n-1);    //calling function
		return n* smaller_fact;
		
		
	}

}
