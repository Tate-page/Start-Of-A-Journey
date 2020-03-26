import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Input a number:");
		int rowsToMiddle=input.nextInt();
		int maxNumber=rowsToMiddle*2-1;
		
		//counts every other number from 1 to max
		for(int i=1;i<=maxNumber;i+=2) 
		{
			//prints blanks
			for(int k=(maxNumber-i)/2;k>0;k--)
				System.out.print(" ");
			
			//prints asterisks
			for(int j=i;j>0;j--)
				System.out.print("*");
		System.out.println();
		}
		
		//counts from maxNumber-2 to 1
		for(int i=maxNumber-2;i>0;i-=2) 
		{
			//prints blanks
			for(int k=(maxNumber-i)/2;k>0;k--)
				System.out.print(" ");
			
			//prints asterisks
			for(int j=i;j>0;j--)
				System.out.print("*");
		System.out.println();
		}
		
	}

}
