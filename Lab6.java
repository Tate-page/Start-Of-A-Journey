import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Input the ammount of lines that you want");
		int lines=input.nextInt();
		
		for(int i=lines;i>0;i--) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
