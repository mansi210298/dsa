package fourteen_march;


public class remove_duplicate_type_12 {
	
	private  Node head;                          
	 
	 private static class Node      //inner class
	 {
		 private int data;
		 private Node next;
		 
		 Node(int data)      //constructor  // line number 10 constructor
		 {
			 this.data=data;
			 this.next=null;
		 }
	 }

public static void display(Node head)
{   
	
	Node curr=head;

  while(curr!=null)
  {
	  System.out.print(curr.data + "----->");
	  
	  curr=curr.next;
  }
   System.out.print("null.");
   System.out.println();
}

      public static Node remove(Node head)
      {
    	  Node curr=head;
    	  
    	  while(curr!=null && curr.next!=null)
    	  {
    		  if(curr.data==curr.next.data)
    		  {
    			  curr.next=curr.next.next;
    		  }
    		  else
    		  curr=curr.next;
    	  }
    	  return head;
      }

public static void main(String[] args)
{
	remove_duplicate_type_12 sl=new remove_duplicate_type_12();    
	sl.head= new Node(10);      
	Node second=new Node(20);         
	Node third=new Node(30);
	Node fourth=new Node(30);
	
	sl.head.next=second;
	second.next=third;
	third.next=fourth;
	
	display(sl.head);
	
	Node result=remove(sl.head);
	display(result);
}
}
