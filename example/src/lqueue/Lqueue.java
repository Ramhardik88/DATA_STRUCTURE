package lqueue;

public class Lqueue 
{
	Node head;
	
	public void queue() {
		head=null;
	}
	
	public void InsertAt(int data) {
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;
		
	}
	public void enqueue(int data) {
		if(head==null) {
			InsertAt(data);
			
		}
		else {
			Node node=new Node();
			node.data=data;
			
			Node n= head;
			while(n.next!=null) {
				n=n.next;
				node.next=n.next;
			}
			n.next=node;
			
		}
		
	}
	public int Dequeue() {
		int temp = 0;
		if(head==null) {
			System.out.print("queue underflow error");
		}
		else {
			 temp=head.data;
			head=head.next;
			
		}
		return temp;
	}
	public void show() {
		Node node=head;
		while(node.next!=null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.print(node.data);
		
	}

}
