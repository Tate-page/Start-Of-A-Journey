package scratch_2;

import java.util.Scanner;

public class LearningMethods {

	public static int sum(int LowerBound, int UpperBound) 
	{
		int ans=0;
		for(int i=LowerBound;i<=UpperBound;i++)
			ans+=i;
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your lower bound number(inclusive)");
		int LowerBound=input.nextInt();
		System.out.print("Enter your upper bound number(inclusive)");
		int UpperBound=input.nextInt();
		
		int sum=0;
		for(int i=LowerBound;i<=UpperBound;i++)
			sum+=i;
		System.out.println("The sum is "+sum);
		
		//also works this way
		System.out.println("The sum of "+LowerBound+" to "+UpperBound+" is "+sum(LowerBound,UpperBound));

	}

}
