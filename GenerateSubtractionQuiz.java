package scratch_2;

import java.util.Scanner;

public class GenerateSubtractionQuiz {

	public static void main(String[] args) {
		final int QUIZ_COUNT=5;
		int correctCount=0;
		int count=0;
		Scanner input=new Scanner(System.in);
		while(count<QUIZ_COUNT) 
		{
			int num1=(int)(Math.random()*10);
			int num2=(int)(Math.random()*10);
			
			if(num2>num1) 
			{
				int temp=num1;
				num1=num2;
				num2=temp;
			}
			int ans=num1-num2;
			System.out.println("What is "+num1+"-"+num2+"?");
			int guess=input.nextInt();
			if(guess==ans) 
			{
				correctCount++;
			}
			else
			{
				System.out.print("Your answer is incorrect.\n "+num1+"-"+num2+"="+ans+"\n");
			}
			count++;
		}
		System.out.println("You got "+correctCount+" correct out of 5");
	}

}
