package scratch_2;

import java.util.Scanner;

public class ForLoopExample {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("How many numbers do you wan to add together?");
		int count=input.nextInt();
		int sum=0;
		for(int i=0;i<count;i++) 
		{
			System.out.println("Input number #"+(i+1));
			int num=input.nextInt();
			sum+=num;
		}
		System.out.println("The sum is "+sum);
	}

}
