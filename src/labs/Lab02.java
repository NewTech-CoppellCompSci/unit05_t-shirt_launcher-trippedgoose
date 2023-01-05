package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}


	public static void problem1() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int i1 = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int i2 = inKey.nextInt();
		
		for (int i = 0; i < 100; i++) {
			if (i1 > i2) {
				System.out.print((int) (Math.random() * (i1 - i2 + 1) + i2));
			}
			else {
				System.out.print((int) (Math.random() * (i2 - i1 + 1) + i1));
			}
			
			System.out.print(" ");
			
		}
		
		
		System.out.print("\n");
		
		
	}


	public static void problem2() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("What is the radius of the cylinder: ");
		double rad = inKey.nextDouble();
		System.out.print("What is the height of the cylinder: ");
		double height = inKey.nextDouble();
		
		System.out.println((Math.pow(rad, 2) * Math.PI) * height);
		
	}


	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("Enter x1: ");
		double x1 = inKey.nextDouble();
		System.out.println("Enter y1: ");
		double y1 = inKey.nextDouble();
		System.out.println("Enter x2: ");
		double x2 = inKey.nextDouble();
		System.out.println("Enter y2: ");
		double y2 = inKey.nextDouble();
		
		
		System.out.println("Distance between points = " + Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
		
		
		
		
		
	}

	
	
	public static void problem4() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a-value: ");
		double a = inKey.nextDouble();
		System.out.print("Enter b-value: ");
		double b = inKey.nextDouble();
		System.out.print("Enter c-value: ");
		double c = inKey.nextDouble();
		
		System.out.println("x1 = " + (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c))))/(2 * a));
		System.out.println("x2 = " + (-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c))))/(2 * a));
	}



}
