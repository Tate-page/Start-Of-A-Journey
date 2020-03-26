import java.util.Scanner;
public class Lab1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("foot to meter");
		System.out.println("input the feet");
		double foot=input.nextDouble();
		double meter=0.305*foot;
		System.out.println(foot+" feet equals "+meter+" meters");
	}

}
