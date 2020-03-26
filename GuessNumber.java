package scratch_2;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*11);
		Scanner input=new Scanner(System.in);
		
		System.out.println("Guess a number between 0 and 10");
		int guess=input.nextInt();
		while(guess!=num) 
		{
			if(guess>num) 
			{
				System.out.println("Nope too high. Try again");
				guess=input.nextInt();
			}
			else 
			{
				System.out.println("Nope too low. Try again.");
				guess=input.nextInt();
			}
		}
		System.out.println("Correct");
	}

}
