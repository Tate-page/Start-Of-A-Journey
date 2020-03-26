import java.util.Scanner;

public class ComputerArea {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Input 0 for Area of Rectangle, put 1 for Area of Circle:");
		int ans=input.nextInt();
		if(ans==0) {
			System.out.println("What is the length?");
			double l;
			l=input.nextDouble();
			System.out.println("What is the width?");
			double w;
			w=input.nextDouble();
			double areaRectangle = l*w;
			System.out.print("The area of a rectangle is "+areaRectangle+" units!");
		}
		else 
		{
			System.out.println("What is the radius?");
			double r;
			r=input.nextDouble();
			double areaCircle=3.14*r*r; 
			System.out.println("The area of a circle with the radius of "+r+" is "+areaCircle+" units!");
		}
	}
}
