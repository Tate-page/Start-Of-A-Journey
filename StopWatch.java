package scratch_2;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		long startTime=System.currentTimeMillis();
		System.out.println("type '0' when you want to stop");
		int stop=input.nextInt();
		while(stop!=0) 
		{
			System.out.println("Input '0' when to stop");
			stop=input.nextInt();
		}
		long stopTime=System.currentTimeMillis();
		long difference=stopTime-startTime;
		System.out.println("Your time is "+difference+" ms");

	}

}
