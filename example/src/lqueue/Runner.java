package lqueue;



public class Runner {

	public static void main(String[] args) {


		Lqueue queue=new Lqueue();

		queue.enqueue(7);
		queue.enqueue(9);
		queue.enqueue(3);
		queue.enqueue(19);
		queue.enqueue(33);
		
		
		queue.Dequeue();
		
		
		queue.show();
	}

}
