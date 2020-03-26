
public class Lab5 {

	public static void main(String[] args) {
		int n=0;
		int min=0;
		while((n*n)<12000)
		{
			n++;
		}
		min=n;
		System.out.println("The smallest number squared that is greater than 12,000 is "+min);
		
		int m=12000;
		int max=0;
		while((Math.pow(m, 3))>12000) 
		{
			m--;
		}
		max=m;
		
		System.out.println("The largest number that is cubed which is smaller than 12,000 is "+max);
 	}

}
