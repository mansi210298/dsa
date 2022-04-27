package eight_march;

public class head_recursion_type_1 {

	public static void main(String[] args)
	{
		print(1);
	}
	
	public static void print(int count)
	{
		if(count==10)
		{
			System.out.println(count);
			return;
		}
				print(count+1);
		System.out.println(count);
	}
}
