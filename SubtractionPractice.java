package scratch_2;

import java.util.Scanner;

public class SubtractionPractice {

	public static void main(String[] args) {
		final int QUIZ_COUNT=5;
		int count=0;
		String output="";
		Scanner input=new Scanner(System.in);
		long startTime=System.currentTimeMillis();
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
				System.out.println("correct");
			}
			else
			{
				while(guess!=ans) 
				{
				System.out.print("Your answer is incorrect.\n "+" What is "+num1+"-"+num2+"?");
				guess=input.nextInt();
				}
			}
			count++;
		}
		long endTime=System.currentTimeMillis();
		long testTime=(endTime-startTime)/1000;
		System.out.println("It took you "+testTime+" seconds\n");

	}

}
