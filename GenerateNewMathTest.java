package scratch_2;

import java.util.Scanner;

public class GenerateNewMathTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int count=0;
		while(count<2) 
		{
			if(count==1) 
			{
				System.out.println("Would you like to continue with practice?T/F");
				boolean cont = input.nextBoolean();
				if(cont!=true)
					break;
				else
					count=0;
			}
			int RanNum1 = (int) (Math.random()*10);
			int RanNum2 = (int) (Math.random()*10);
			System.out.println("What is "+RanNum1+" * "+RanNum2);
			int ans=input.nextInt();
			while((RanNum1*RanNum2)!=ans) 
			{
				System.out.println("No that's not right. What is "+RanNum1+" * "+RanNum2);
				ans=input.nextInt();
			}
			System.out.println("Correct");
			count++;
		}
	}
}