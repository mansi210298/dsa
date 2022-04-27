//insert new node in sorted array
package fourteen_march;


public class insert_node_type_13 {
	
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
		
		public static void display(Node head)
		{
			Node curr=head;
			while(curr!=null)
			{
				System.out.print(curr.data+"----->");
				curr=curr.next;
			}
			System.out.println("null");
		}
		
		public static Node insert(Node head,Node new_node)
		{
			Node curr=head;
			Node tmp=null;
			
			while(curr!=null && curr.data < new_node.data)  //new_node=50
			{
				tmp=curr;
				curr=curr.next;
			}
			tmp.next=new_node;
			new_node.next=curr;
			return head;
		}
		
		public static void main(String[] args)
		{
			insert_node_type_13 sl=new insert_node_type_13();
			sl.head= new Node(10);
			Node second= new Node(20);
			Node third= new Node(40);
			Node fourth=new Node(70);
			
			sl.head.next=second;
			second.next=third;
			third.next=fourth;
			
			Node new_node=new Node(50);
			
			display( sl.head);
			
			Node result=insert(sl.head,new_node);
			display(result);
		}
	
}
