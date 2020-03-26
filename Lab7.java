
public class Lab7 {

	public static void main(String[] args) {
		System.out.println("-----------------------------");
		String heading1="x";
		String heading2="x-squared";
		String heading3="x-cubed";
		System.out.print("|");
		System.out.printf( "%-5s %5s %9s", heading1, heading2, heading3);
		System.out.println("  |");
		System.out.println("|--   ---------   -------   |");
		for(int i=2;i<=10;i++) 
		{
			System.out.print("|");
			int squared=(int)(Math.pow(i, 2));
			int cubed=(int) (Math.pow(i, 3));
			System.out.printf("%-3s %10s %9s", i, squared, cubed);
			System.out.println("   |");
		}
		System.out.println("-----------------------------");

	}

}
