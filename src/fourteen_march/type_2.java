//program for deletion at beginning, middle and end:

package fourteen_march;

public class type_2 {
	private Node head;
	
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
	
	
	public void length()
	{
		Node curr=head;
		int count=0;
		while(curr!=null)
		{   curr=curr.next;
			count++;
		}
		System.out.println(count);
		
	}
	
	
	//Deletion at beginning
	public void del_beg()
	{
		Node curr=head;
		head=curr.next;
	}
	
	//Deletion at end
	public void del_end()
	{
		Node curr=head;
		while(curr.next.next!=null)
		{
			curr=curr.next;
		}
		curr.next=null;
	}
	
	//Deletion at given position
	public void del_pos(int position)
	{
		if(head==null)
		{
			System.out.println("No element to delete!!");
		}
		else if(position==1)
		{
			head=head.next;
		}
		else
		{
			Node curr=head;
			int i=1;
			while(i<position-1)
			{
			    curr=curr.next;
			    i++;
			}
			  Node tmp=curr.next;
			  curr.next=tmp.next;
			
		}
	
	}
	
	public static void main(String[] args)
	{
		type_2 sl=new type_2();
		sl.head=new Node(10);   // creation of nodes right now
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		Node fifth=new Node(50);
		
		sl.head.next=second;     //joining of the nodes together
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		              // no need to join fifth to null its already known by node class
		
		sl.display();
		sl.length();
		
		
		//function for deletion of node from beginning
		sl.del_beg();
		sl.display();
		
		//function for deletion of node from end
		sl.del_end();
		sl.display();
		
		//function for deletion of node at given position;
		sl.del_pos(2);
		sl.display();
		
			
		
		
		}

}
