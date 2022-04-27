package fourteen_march;


public class merge_2_type_10 {
	
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
	 
	 public static Node merge(Node a ,Node b)
	 {
		 Node head=null;
		 
		 if(a.data<=b.data)
		 {
			head=a;
			a=a.next;
		 }
		 else {
			 head=b;
			 b=b.next;
		 }
		 
		 
		 Node curr=head;
		 while(a!=null && b!=null)
		 {
			 if(a.data<=b.data)
			 {
				curr.next=a;
				a=a.next;
			 }
			 else {
				curr.next =b;
				 b=b.next;
			 }   
			 
			 curr=curr.next;
		 }
		 
		 if(a==null)
		 {
			 curr.next=b;
		 }
		 if(b==null)
		 {
			 curr.next=a;
		 }

		return head; 
	 }
	 
	 
	 
	 public static void main(String[] args)
	 {
		 merge_2_type_10 sl=new merge_2_type_10();
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
	
	  merge_2_type_10 s2=new merge_2_type_10();
	s2.head=new Node(20);
	Node sixth=new Node(40);
	
	s2.head.next=sixth;
	
	System.out.println();
	s2.display();
	
	
	System.out.println();
	 merge_2_type_10 result=new merge_2_type_10();
	result.head =merge(sl.head,s2.head);
	result.display();

}
}
