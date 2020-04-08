package queue;

public class QueueArray {
	
	int queue[]=new int[5];
	int size;
	int front;
	int rear;
	
	public void enqueue(int data) {
		
		if(!isFull()) {
			
		
		queue[rear]=data;
		 rear=(rear+1)%5;
		 size=size+1;	
	}
		else
		{
			System.out.println("queue overflow will occur");
		}
	}
	
	
	
	public int dequeue() {
		
		int data=queue[front];
		if(!isEmpty()) {
			
		
		front=(front+1)%5;
		size=size-1;
	}
		else {

			System.out.println("queue underflow will occur");
			
		}
		return data;
		
	}
	public int getsize() {
		return size;
	}
	public boolean isEmpty() {
		return getsize()==0;
		
	}
	public boolean isFull() {
		return getsize()==queue.length;
		
	}
	
	public void show() {
		for(int i=0;i<size;i++) {
			System.out.print(queue[(front+i)%5]+" ");
		}
		System.out.println();
	
		System.out.println("queue element size :");
	for(int n: queue) {
		System.out.print(n+" ");
		
		
	}}

}
