package queue;

public class Runner {

	public static void main(String[] args) {
		
		 QueueArray queue=new  QueueArray();
		 
		 System.out.println( queue.isEmpty());
		 
		 queue.enqueue(2);
		 queue.enqueue(3);
		 queue.enqueue(6);
		 queue.enqueue(4);
		 
		
		 queue.enqueue(8);
		System.out.println( queue.getsize());
		 queue.enqueue(7);
	
		 queue.show();
		
		

	}

}
