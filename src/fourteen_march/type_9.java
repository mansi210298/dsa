//Palindrome or not

package fourteen_march;

public class type_9 {

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
	
	public void length()
	{
		Node curr=head;
		int count=0;
		while(curr!=null)
		{
			count++;
			curr=curr.next;
		}
		System.out.println(count);
	}  
	
	
public static void main(String[] args)
{  
	type_9 sl=new type_9();
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
	sl.length();
}
}
