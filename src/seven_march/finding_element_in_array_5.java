package seven_march;

public class finding_element_in_array_5 {
	
	static int array[]= {1,2,3,5,6,7,10,55,6,8};
	
	 public static void main(String[] args)
	{
		
		int target=8;
		print(0,target);    //starting conditions
	}
	
	public static void print(int i,int target)
	{
	  if(array.length==i)	  //base conditions
	  {
		  System.out.println("Element not found");
		  return;
	  }
	  
	  if(array[i]==target)
	  {
		  System.out.println("Element found at position "+ i);
		  return;
	  }
		
	 print(++i,target);	   //increment
	}

}
