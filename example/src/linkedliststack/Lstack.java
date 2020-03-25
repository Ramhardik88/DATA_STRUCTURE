package linkedliststack;

public class Lstack
{
	Node head;
	
	public void stack() {
		head =null;
		
	}
	public void push(int data) {
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;
		
//		System.out.println(node.data);
		
		}
	
	public int pop() {
		Node  temp = null;
		if(head==null) {
			System.out.println("stack under flow error");
			
		}
		else
		{
		       temp=head;
			head=head.next;
			
		}
		return temp.data;
	
		
	}
	
//	public void peek() {
//		if(head==null) {
//			System.out.print("no such element found");
//		}else {
//			System.out.print("peek value is"+head.data);
//		}
//	}
	public int peek() {
		return head.data;
		
	}
	public boolean isEmpty() {       // no need use the IsFull operation beacuse the size is dynamic
		if(head==null) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public void show() {
		Node n=head;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
		
	}

}
