//find kth element from last in linked list
//Approach 1
package fourteen_march;

/*public class type_7 {
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
	
	
	public Node element_from_last(int n)
	{
		if(head==null)
		{
			return null;
		}
		
		if(n<=0)
		{
		throw new IllegalArgumentException("Invalid value: n= "+ n);
		}
		
		Node main=head;
		Node reference=head;
		
		int count=0;
		
		while(count<n)
		{
			reference=reference.next;
			count++;
		}
		
		while(reference!=null)
		{
			reference=reference.next;
			main=main.next;
		}
		
		return main;
		
		
	}
	
	
	public static void main(String[] args)
	{
		type_7 sl=new type_7();
		sl.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		
		
		sl.head.next=second;
		second.next=third;
		third.next=fourth;
		
		sl.display();
		
		Node value=sl.element_from_last(4);     //2 is index do not write element
		System.out.println(value.data);
	}

}    **/


//Approach 2nd

public class type_7
{private Node head;

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

public int length()
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

public Node element_from_last(int n,int count)   //n=position=2 ie 30, count=4
{
	int position=0;
	position=(count-n)+1;   //3rd
		
	return position;
	
}


	

public static void main(String[] args)
{
	type_7 sl=new type_7();
	sl.head=new Node(10);
	Node second=new Node(20);
	Node third=new Node(30);
	Node fourth=new Node(50);
	
	
	sl.head.next=second;
	second.next=third;
	third.next=fourth;
	
	sl.display();
	int count=sl.length();
	
	int value=sl.element_from_last(2,count);
	System.out.println(value.);
	
	
	
	//Node value=sl.element_from_last(4);     //2 is index do not write element
	//System.out.println(value.data);
}
}




