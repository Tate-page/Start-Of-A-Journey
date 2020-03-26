import java.util.Scanner;
public class airwayLength {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Input the velocity in m/s:");
		double velocity=input.nextDouble();
		System.out.println("Input the acceleration in m/s^2:");
		double acceleration=input.nextDouble();
		double length=(velocity*velocity)/(2*acceleration);
		System.out.println("The runway must be "+length+" meters long.");
	}

}
