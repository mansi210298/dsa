package fourteen_march;

public class add_type_11 {
	private Node head;
   
	public static class Node
	{
		private int data;
		private Node next;
		
		Node(int data)
		{
        this.data=data;
        this.next=null;
	}
		
		public static void display(Node head)
		{
			Node curr=head;
			
			while(curr!=null)
			{
				System.out.print(curr.data+"---->");
				curr=curr.next;
			}
			System.out.print("null");
			
		}
		
		public static Node add(Node a,Node b)
		{
			Node dummy=new Node(0);
			Node tail=dummy;
		
			
			int carry=0;
			while(a!=null || b!=null)
			{   
				int x=(a!=null)? a.data:0;
				int y=(b!=null)? b.data:0;
				
				int sum=x+y+carry;
				carry=sum/10;   // divide gives quotient 
				
				tail.next=new Node(sum%10);  //9+4=13  so 3 new node and 1 will be carry carry means divide
				tail=tail.next;
				
				if(a!=null)
				{
					a=a.next;
				}
				if(b!=null)
				{
					b=b.next;
				}		
			}
			
			if(carry>0)
			{
				tail.next=new Node(carry);
			}
			
			return dummy.next;
			
			
		}
		
	public static void main(String[] args)
	{
		add_type_11 sl1=new add_type_11();
		sl1.head=new Node(2);
		Node second=new Node(4);
		Node third=new Node(8);
		Node fourth=new Node(3);
		
		sl1.head.next=second;
		second.next=third;
		third.next=fourth;
		
		add_type_11 sl2=new add_type_11();
	   sl2.head=new Node(1);
		Node fifth=new Node(9);
			
		sl2.head.next=fifth;
		
		display(sl1.head);
		System.out.println();
		display(sl2.head);
		System.out.println();
		Node result=add(sl1.head,sl2.head);
		display(result);			
									
	}			
					
		}
}
