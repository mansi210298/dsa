//searching of an element in linked list

package fourteen_march;

public class type_3 {
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
	
	
	public void search(int data,boolean search)
	{   Node curr=head;
		int i=1;
		while(curr!=null)
		{
			if(curr.data==data)
			{
				search= true;
				break;
			}
			curr=curr.next;
			i++;
		}
		
		if(search)
		{
			System.out.println("data found at position "+ i++);
		}
		else
		{
			System.out.println("data not found");
		}
	}
	
	
	public static void main(String[] args)
	{
		type_3 sl=new type_3();
		sl.head= new Node(10);
		Node second= new Node(20);
		Node third= new Node(40);
		Node fourth=new Node(50);
		
		sl.head.next=second;
		second.next=third;
		third.next=fourth;
		
		
		sl.display();
		
		
		sl.search(40, false);
	}

}
