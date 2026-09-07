// Q8: Total Amount with Interest Story Find total amount after adding simple interest.
 
import java.util.Scanner;

class TotalAmount{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		double p=sc.nextDouble();
		System.out.println("Enter the rate:");
		double r=sc.nextDouble();
		System.out.println("Enter the no of year:");
		double t=sc.nextDouble();
		double totalAmount=p+(p*r*t/100);
		System.out.println("Total amount is :"+totalAmount);
		sc.close();
	}
}