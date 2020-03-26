import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Input X1");
		Double x1 = input.nextDouble();
		System.out.println("Input Y1");
		Double y1 = input.nextDouble();
		System.out.println("Input X2");
		Double x2 = input.nextDouble();
		System.out.println("Input Y2");
		Double y2 = input.nextDouble();
		Double x = (x2-x1)*(x2-x1);
		Double y = (y2-y1)*(y2-y1);
		Double XplusY = x+y;
		Double ans=Math.sqrt(XplusY);
		System.out.print("The distance is:"+ans);
	}

}
