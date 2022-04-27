//Merge of two linked list using dummy node

package fourteen_march;

  public class Merge_type_10 {
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
		 System.out.print("null"); 
	 }
	 
	 public static Node merge(Node a, Node b)
	 {
		 Node dummy=new Node(0);
		Node head= dummy;
		 
		 while(a!=null && b!=null)
		 {
			 if(a.data <= b.data)
			 {
				 head.next=a;
				 a=a.next;
			 }
			 else
			 {
				head.next=b;
				b=b.next;
			 }
			 head=head.next;
		 }
		 
		 if(b==null)
		 {
			head.next=a; 
		 }
		 if(a==null)
		 {
			 head.next=b;
		 }
		 return dummy.next;
	 }
	 
	 public static void main(String[] args)
	 {
		 Merge_type_10 sl=new Merge_type_10();
		 sl.head=new Node(10);
		 Node second=new Node(30);
		 Node third=new Node(50);
		 Node fourth=new Node(70);
		 Node fifth=new Node(100);
		 
		sl.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
	sl.display();
	
	  Merge_type_10 s2=new Merge_type_10();
	s2.head=new Node(20);
	Node sixth=new Node(40);
	
	s2.head.next=sixth;
	
	System.out.println();
	s2.display();
	
	
	System.out.println();
	
	Merge_type_10 result=new Merge_type_10();
		 result.head=merge(sl.head,s2.head);
		 result.display();
		 
		 
		 
	 }

}
