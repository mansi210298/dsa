//reverse a linked list with return type;

package fourteen_march;

public class type_5 {

	private  Node head;
	
	private static class Node
	{
		private int data;
		private Node next;
	
	 Node(int data)
	 {
		 this.data=data;
		 this.next=null;
	 }
	}
	
	public void display(Node head)
	{ 
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+"----->");
			curr=curr.next;
		}
		
		System.out.print("null");
		
	}
	
	
	public Node reverse(Node head)
	{
		if(head==null)
		{
			return head;
		}
		
		Node curr=head;
		Node forward=head;
		Node prev=null;
		
		while(curr!=null)
		{
			curr.next=forward;
			curr.next=prev;
			prev=curr;
			curr=forward;
		}
	      head=prev;
		  return head;
		
	}
	
	public static void main(String[] args)
	{
		type_5 sl=new type_5();
		sl. head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		
		
		sl.head.next=second;
		second.next=third;
		third.next=fourth;
		
		
		sl.display(sl.head);
		
		Node rev=sl.reverse(sl.head);
		sl.display(rev);
	}
}
