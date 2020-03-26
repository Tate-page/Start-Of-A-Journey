package scratch_2;

import java.util.Scanner;

public class Hypotenuse {

	public static double Hyp(int a, int b) {
		return Math.sqrt((a*a)+(b*b));
	} 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the first number:");
		int a=input.nextInt();
		System.out.println("Input the second number:");
		int b=input.nextInt();
		System.out.println("The hypotenuse, or however you spell it is:"+Hyp(a,b));
		

	}

}
