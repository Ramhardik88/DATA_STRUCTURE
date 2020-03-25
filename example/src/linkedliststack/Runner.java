package linkedliststack;

public class Runner {

	public static void main(String[] args) {
		 Lstack nums=new  Lstack();
		
		 
		  System.out.println( nums.isEmpty());
		 nums.push(13);
	
		 nums.push(23);
		 
		 nums.push(49);
        nums.show();
       System.out.println( "pop element"+nums.pop());
       nums.show();
       System.out.println( nums.peek());
       System.out.println( nums.isEmpty());
	}

}
