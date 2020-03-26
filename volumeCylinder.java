import java.util.Scanner;

public class volumeCylinder {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is the radius of the Cylinder?");
		double r=input.nextDouble();
		System.out.println("What is the height?");
			double h=input.nextDouble();
			double areaCircle = 3.14*r*r;
			double volumeCylinder =areaCircle*h;
			System.out.println("The area of a circle is: "+areaCircle);
			System.out.println("The volume of a cylinder is: "+volumeCylinder);
	}
}
	
