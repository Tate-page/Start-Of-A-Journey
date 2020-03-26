import java.util.Scanner;

public class HW7 {
	
	public static double mean(int boundary,int n) 
	{
		
		double result=0;
		int intArray[]=new int[n];
		
		for(int i=0;i<n;i++) 
		{
			
			int num=(int) (Math.random()*boundary);
			result+=num;
			intArray[i]=num;
		}
		
		result=result/n;
		deviation(intArray, result,n);
		return result;
	}
	
	public static void deviation(int intArray[],double result, int n) 
	{
		double num=0;
		double mean=(result);
		for(int i=0;i<n;i++) 
		{
			double sum=0;
			if(intArray[i]>result) {
				sum=intArray[i]-mean;
			}
			else
				sum=mean-intArray[i];
			num+=sum;
		}
		double ans=num/result;
		System.out.println("The standard deviation is "+ans);
	}
	
	public static void main(String[] args) {
		//find mean
		int boundary=10;
		int n=10;
		
		double mean=mean(boundary,n);
		
		System.out.println("The mean is "+mean);
		//I have no idea how to call the standard deviation in the main method, because the numbers are randomly generated in mean() and it return just a double
		
		Scanner input=new Scanner(System.in);
		int sumArray[]=new int[10];
		System.out.println("provide 10 numbers:");
		for(int i=0;i<10;i++) 
		{
			int lineNum=i+1;
			System.out.println("#"+lineNum+":");
			sumArray[i]=input.nextInt();
		}
		int sum=0;
		
		for(int i=0;i<10;i++) 
		{
			sum+=sumArray[i];
		}
		System.out.println("The sum of these numbers are "+sum);
		
		sum=0;
		int i=0;
		while(i<10) {
			sum+=sumArray[i];
			i++;
		}
		System.out.println("The sum of these numbers are "+sum);
		
		sum=0;
		i=0;
		do 
		{
			sum+=sumArray[i];
			i++;
		}while(i<10);
		System.out.println("The sum of these numbers are "+sum);
	}

}
