package scratch_2;

import java.util.Scanner;

public class chineseZodiac {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please input the year");
		int year=input.nextInt();
		switch (year%12) {
		case 0: System.out.println("The year of the monkey");break;
		case 1: System.out.println("The year of the rooster");break;
		case 2: System.out.println("The year of the dog");break;
		case 3: System.out.println("The year of the pig");break;
		case 4: System.out.println("The year of the rat");break;
		case 5: System.out.println("The year of the ox");break;
		case 6: System.out.println("The year of the tiger");break;
		case 7: System.out.println("The year of the rabbit");break;
		case 8: System.out.println("The year of the dragon");break;
		case 9: System.out.println("The year of the snake");break;
		case 10: System.out.println("The year of the horse");break;
		case 11: System.out.println("The year of the sheep");break;
		}

	}

}
