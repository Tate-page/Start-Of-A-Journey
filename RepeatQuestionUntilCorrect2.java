package scratch_2;

import java.util.Scanner;

public class RepeatQuestionUntilCorrect2 {

	public static void main(String[] args) {
		int num1=(int)(Math.random()*11);
		int num2=(int)(Math.random()*11);
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is "+num1+"+"+num2+"?");
		int ans=input.nextInt();
		
		while(num1+num2!=ans) 
		{
			System.out.println("Sorry that is incorrect");
			System.out.println("Try Again.");
			System.out.println("What is "+num1+"+"+num2+"?");
			ans=input.nextInt();
		}
		System.out.println("Correct, Nice Job!");
	}

}
