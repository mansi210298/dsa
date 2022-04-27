//linkedlist creation with traversing/printing with length of nodes with insertion a node at beginning,end,at middle;

package fourteen_march;


public class type_1 {           
	 
	private  Node head;   //variable declare //head is the list instance or reference variable // hear Node is the type
	//private Node last;                            
	 
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

public void display()
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

 public void length()
{ 
	if(head==null)
		//return 0;
	{
		System.out.println("null");
	}
	else
	{   int count=0;
		Node curr=head;
		while(curr!=null)
		{
		  count++;
		   curr=curr.next;
		}
		//return count;
		System.out.println(count);
		
	}
}
   
   
//Insertion at beginning..
 
 public void insert_beg(int value)
 {
	 Node new_node=new Node(value);    //creation of that node which we want to insert at first  //this is not for calling constructor
	 
	 if(head==null)
	 {
		 head=new_node;
		 new_node.next=null;
	 }
	 
	 else
	 {  Node tmp=head;
		 head=new_node;
		 new_node.next=tmp;
		 
	 }
 }

 
 //Insertion at end..
 public void insert_end(int value)
 {
	 Node new_node=new Node(value);   //creation of new node to be inserted
	 
	 Node curr=head;
	 while(curr.next!=null)
	 {    curr=curr.next;
		 
	 }
	 curr.next=new_node;
	 new_node=null;
     	 
 }
 
// public void insert_at_end(int value)
// {
//	 Node new_node=new Node(value);
//	 
//	last.next=new_node;
//	new_node=null;
// }
 
 
 //Insertion at given position
 
 public void insert_mid(int position,int value)
 {
	 Node new_node=new Node(value);       //creation of new node
	 
	 if(position==1)
	 {
		 new_node.next=head;
		 head=new_node;
	 }
	 
	 Node curr=head;
	 int i=1;
	while(i<position-1)    //important 
	{
		curr=curr.next;
		i++;
	}
	Node tmp=curr.next;
	curr.next=new_node;
	new_node.next=tmp;
	
	 
		 
		 
 }
 
 
 
  

public static void main(String[] args)
{
	type_1 sl=new type_1();     //main class initialize 
	sl.head= new Node(10);      //creating a node with data
	Node second=new Node(20);         //cursor moves towards line number 13 constructor
	Node third=new Node(30);            //cursor moves towards line number 13 constructor
	
	sl.head.next=second;
	second.next=third;
	
	
	sl.display();
	//System.out.println("The length is-- "+sl.length());
	
	sl.length();
	
	//for beginning insertion
	sl.insert_beg(6);
	sl.insert_beg(5);
	sl.display();
	sl.length();
	
	
	//for at end insertion
	sl.insert_end(10);      
	sl.insert_end(15);
	sl.display();
	sl.length();
	
	//sl.last=new Node(15);
	//sl.insert_at_end(20);
	//sl.display();
	
	
	//insertion at middle
	sl.insert_mid(2,28);
	sl.display();
	
}
}
