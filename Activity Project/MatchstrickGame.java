package gameee;

import java.util.Scanner;

public class MatchstrickGame 
{
	public static void main(String[] args) 
	{
		System.out.println("\n --- Welcome To Match Stick Game --- \n");
        	System.out.println("RULES: ");
	        System.out.println("==> Game starts with 21 matchsticks laid out in front of two players.");
	        System.out.println("==> The players take turns removing 1, 2, 3 or 4 matchsticks at a time.");
	        System.out.println("==> The player who is forced to take the last matchstick loses");
        
		Scanner scanner = new Scanner(System.in);
		int totalMatchsticks = 21;
	        
	    	System.out.println("\nMatchstick Game: Avoid picking the last matchstick to win!");
	        
	    	while (totalMatchsticks > 1) 
	    	{
	    		while (true) 
	        	{
	        		System.out.print("\nYour turn, pick 1-4 matchstick(s): ");
	        		int userMove = scanner.nextInt();
	        		if (userMove >= 1 && userMove <= 4) 
	        		{
		        		totalMatchsticks-=userMove;
		        		System.out.println("\nTotal matchsticks remaining: " + totalMatchsticks);
		        		
		        		switch (userMove)
	        			{
						case 1:
							System.out.println("\nComputer Choose: 4");
							totalMatchsticks-=4;
							System.out.println("\nTotal matchsticks remaining: " + totalMatchsticks);
							break;
							
						case 2:
							System.out.println("\nComputer Choose: 3");
							totalMatchsticks-=3;
							System.out.println("\nTotal matchsticks remaining: " + totalMatchsticks);
							break;
							
						case 3:
							System.out.println("\nComputer Choose: 2");
							totalMatchsticks-=2;
							System.out.println("\nTotal matchsticks remaining: " + totalMatchsticks);
							break;
							
						case 4:
							System.out.println("\nComputer Choose: 1");
							totalMatchsticks-=1;
							System.out.println("\nTotal matchsticks remaining: " + totalMatchsticks);
							break;
							
						default:
							System.out.println("\nInvalid Move pick between 1 - 4");
	        			}
		        	} 
		        	else 
		        	{
		        		System.out.println("\nInvalid move. You can pick between 1 and 4 matchsticks.");
		        	}
		        	if (totalMatchsticks <= 1) 
		            	{
			            	System.out.println("\nComputer is forced to pick the last matchstick. \nComputer Win!!!");
			            	break;
		            	}	
	        	}
		}   
		scanner.close();
	}
}
