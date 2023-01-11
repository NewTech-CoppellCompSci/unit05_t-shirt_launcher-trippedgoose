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
				double t1 = (-1 * Math.sin(Math.toRadians(launchA)) * launchV  
						+ Math.sqrt(Math.pow(Math.sin(Math.toRadians(launchA)) * launchV, 2) - (4 * (-4.9) * (-1* yPos))))
						/-9.8;
				double t2 = (-1 * Math.sin(Math.toRadians(launchA)) * launchV 
						- Math.sqrt(Math.pow(Math.sin(Math.toRadians(launchA)) * launchV, 2) - (4 * (-4.9) * (-1 * yPos))))
						/-9.8;
				
				double t = Math.max(t1, t2);
				
				xPos = Math.cos(Math.toRadians(launchA)) * launchV * t;
				
				finished = true;

			}
			
			
			System.out.print("Time: " + time + "s\n\tx-pos: " + xPos + "m\n\ty-pos: " + yPos + "m\n");
			
			
			
			
			time++;
			
			
			
		}
		
		
	}
	
}
