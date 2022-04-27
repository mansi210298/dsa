//middle element of linked list:

package fourteen_march;


public class type_8 {
	private Node head;

	private static class Node
	{
		 int data;
		Node next=null;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

	public void display()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data +"----->");
			curr=curr.next;
		}
		System.out.println("null");
	}
	
  /*	public int length()
	{
		Node curr=head;
		int count=0;
		while(curr!=null)
		{
			count++;
			curr=curr.next;
		}
		return count;
	}  */
	
	public void middle()
	{
		/*Node slow=head;                 Two Pointer Approach (required one time traversing)
		Node fast=head;
		
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println(slow.data);
	 */ 
		
		Node curr=head;
		int count=0;
		
		while(curr!=null)
		{
			count++;
			curr=curr.next;
		}              //count= 4 here
		
		System.out.println(count);
		
	
		curr=head;      //because curr became null due to above traversing
			int mid=0;
			
		while(mid<count/2)      //works in even odd both 
		{
			curr=curr.next;       //two pass or double traversing approach
			mid++;
			
		}
		System.out.println(curr.data);
		
		
		
		
	}
		
	public static void main(String[] args)
	{  
		type_8 sl=new type_8();
		sl.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(50);
		Node fifth=new Node(60);
		
		
		sl.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		sl.display();
		// sl.length();   because I am taking length inside middle function
		
		sl.middle();

}
}
