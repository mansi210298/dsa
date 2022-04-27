package seven_march;

public class print_even_number_from_an_array_6 {
	
	static int array[]= {1,3,2,50,43,44,60,61,26};
	
	public static void main(String[] args)
	{
		print(0);
	}

	public static void print(int i)
	{ 
		//base case to stop the recursion
		if(array.length==i)
		{
			return;
		}
		
		//actual logic
		if(array[i]%2==0)
		{
			System.out.println(array[i]);
			
		}
		
		print(i+1);
	}
}
