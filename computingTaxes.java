import java.util.Scanner;
public class computingTaxes {
	Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Input the number that corresponds with your status \n0: single\n1:married filed jointly\n2:married file seperately\n3:head of household");
		int status=input.nextInt();
		System.out.println("What was your income for 2019?");
		double income=input.nextInt();
		double taxTotal;
		if(status==0) {
			taxTotal=income*0.1;
			income=income-8350;
			if(income>0){
				taxTotal=taxTotal+(income*.15);
				income=income-25600;
				if(income>0) {
					taxTotal=taxTotal+(income*.25);
					income=income-34574;
					if(income>0) {
						taxTotal=taxTotal+(income*.28);
						income=income-
					}
					else
						System.out.println("You have to pay $"+taxTotal);
				}
				else
					System.out.println("You have to pay $"+taxTotal);
			}
			else
				System.out.println("You have to pay $"+taxTotal);
		}
		else if(status==1) {
			
		}
		else if(status==2) {
			
		}
		else if(status==3) {
			
		}
		else {
			System.out.println("You input you status incorrectly");
		}
	}

}
