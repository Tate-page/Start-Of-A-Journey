import java.util.Scanner;
public class BMI {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Input your heign(m):");
		Double height=input.nextDouble();
		System.out.println("Input your weight(kg):");
		Double weight=input.nextDouble();
		double BMI=weight/Math.sqrt(height);
		if(BMI<18.5)
			System.out.println("You are underweight with a BMI of "+BMI);
		else if(18.5<=BMI && BMI<25)
			System.out.println("Your weight is normal with a BMI of "+BMI);
		else if(25<=BMI && BMI<30)
			System.out.println("You are overweight with a BMI of "+BMI);
		if(30<=BMI)
			System.out.println("You are obese with a BMI of "+BMI);
	}

}
