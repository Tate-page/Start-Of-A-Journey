package scratch_2;

public class threePointThirtyFiveB {

	public static void main(String[] args) {
		int income=100;
		Double tax;
		if(income>10000)
			tax=income*0.2;
		else
			tax=(income*0.17)+1000;
		
		System.out.println("The tax  is $"+tax+".");
	}

}
