//reverse the linked list with void function

package fourteen_march;

public class type_4 {
private Node head;
	
	public static class Node
	{
		private int data;
		private Node next=null;
		
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
			System.out.print(curr.data+"----->");
			curr=curr.next;
		}
		System.out.println("null");
	}
	
	
	//reverse
	public void reverse()
	{
		if(head==null)
		{
			System.out.println("null linked list");
		}
		
		Node curr=head;
		Node forward=head;
		Node prev=null;      //previous ---->null
		
		while(curr!=null)
		{
			forward=curr.next;
			curr.next=prev;
			prev=curr;
			curr=forward;
		}
		head=prev;
	
	}
	
	
	
	
	public static void main(String[] args)
	{
		type_4 sl=new type_4();
		sl.head= new Node(10);
		Node second= new Node(20);
		Node third= new Node(40);
		Node fourth=new Node(50);
		
		sl.head.next=second;
		second.next=third;
		third.next=fourth;
		
		
		sl.display();
		
		
	sl.reverse();
	sl.display();
		
	}	

}
