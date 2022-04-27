//delete whole linked list;

package fourteen_march;

public class type_6 {
	
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
  
  public void display(Node head)
  {
	  Node curr=head;
	  while(curr!=null)
	  {
		  System.out.print(curr.data+"----->");
		  curr=curr.next;
	  }
	  System.out.println("null");
  }
  
  public void empty(Node head)
  {
	  head.next=null;
  }
  
  
  public static void main(String[] args)
  {
	  type_6 sl=new type_6();
	  sl.head=new Node(10);
	  Node second=new Node(20);
	  Node third=new Node(30);
	  
	  sl.head.next=second;
	  second.next=third;
	  
	  sl.display(sl.head);
	  
	  sl.empty(sl.head);
	  sl.display(sl.head);
  }

}
