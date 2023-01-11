package performance_task;

import java.util.Scanner;

public class Performance_Task {

	public static double xPos = 0;
	public static double yPos = 1;
	public static int time = 0;
	
	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter launch velocity (m/s): ");
		int launchV = inKey.nextInt();
		System.out.print("Enter launch angle (degrees): ");
		int launchA = inKey.nextInt();
		
		
		System.out.println("Projectile's Path: ");
		
		boolean finished = false;
		
		
		
		
		while (!finished) {
			
			xPos = Math.cos(Math.toRadians(launchA)) * launchV * time ;
			yPos = Math.sin(Math.toRadians(launchA)) * launchV * time - 0.5 * 9.8 * Math.pow(time, 2);
			
			
			if (yPos < 0) {
				
				yPos = 0;
				finished = true;
			}
			
			
			System.out.print("Time: " + time + "s\n\tx-pos: " + xPos + "m\n\ty-pos: " + yPos + "m\n");
			
			
			
			
			time++;
			
			
			
		}
		
		
	}
	
}
