package scratch_2;

import java.util.Scanner;

public class subtractionQuiz {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int number1=(int) (Math.random()*10);
		int number2=(int) (Math.random()*10);
		
		if(number1<number2){ 
			int temp=number1;
			number1=number2;
			number2=temp;
		}
		
		int ans=number1-number2;
		
		System.out.print("what is "+number1+" - "+number2+"?");
		int var=input.nextInt();
		
		System.out.println((ans==var)?"Corrrect!":"Sorry, incorrect");
	}

}
