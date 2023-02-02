package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
		
		
		System.out.println("What is your starting amount?");
		int startAmount = in.nextInt();
		
		
		System.out.println("What is the win chance?");
		double winChance = in.nextDouble();
		
		
	
		System.out.println("What is the win limit?");
		int winLimit = in.nextInt();
		
		
		int simulations = 1;
		

		while(startAmount>=0 && winLimit>= startAmount)
		{
			if (Math.random()< winChance)
			{
			startAmount++;	
			System.out.println("Simulation: " + startAmount + " WIN") ;
	
		}
			else

		{
			startAmount--;
			System.out.println("Simulation: " + startAmount + " LOSE");
			
		}
		}
		 
			
		
		
		

		
		
		
		// add 1 to amount -1 for lose
	

		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
