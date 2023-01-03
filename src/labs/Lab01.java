package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		int input1 = inKey.nextInt();
		System.out.println("Enter another positive integer: ");
		int input2 = inKey.nextInt();
		
		System.out.println(input1 + "^" + input2 + " = " + Math.pow(input1, input2));
		
		
		
	}
	
	
	
	public static void problem2() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("Enter a positive number: ");
		int input1 = inKey.nextInt();
		
		System.out.println("The square root of " + input1 + " is " + Math.sqrt(input1));
		
		
		
		
			
	}
	
	
	
	public static void problem3() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("Length of side A: ");
		int A = inKey.nextInt();
		System.out.println("Length of side B: ");
		int B = inKey.nextInt();
		
		
		System.out.println("Hypotenuse = " + Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2)));
		
		
		
	}
	
	
	
	public static void problem4() {
		
		int max = Integer.MIN_VALUE; 
		int input = 1;
		int min = Integer.MAX_VALUE;
		
		
		
		Scanner inKey = new Scanner(System.in);
		
		
		while(input != 0) {
			System.out.print("Enter an integer: ");
			input = inKey.nextInt();
			
			
			max = Math.max(max, input);
			min = Math.min(min, input);
		}
		System.out.print("Max = " + max + "\nMin = " + min);
		
		
	}
	
	
	

}
