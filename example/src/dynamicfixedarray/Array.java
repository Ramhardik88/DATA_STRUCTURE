package dynamicfixedarray;

import java.util.Scanner;

public class Array
{

	public static void main(String []args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("enter the size of the array");
	int size=scan.nextInt();
	System.out.println("enter the  elements");
	
	int arr[]=new int[size];
	
	for(int i=0;i<size;i++) {//for reading 
		  
		arr[i]=scan.nextInt();
		
	}
	for(int i:arr) {                //for printing array
		System.out.println(i);
	}
	
}
	
}
