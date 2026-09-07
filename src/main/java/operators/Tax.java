// Q41 : You paid ₹1180 after 18% tax. Find original price before tax. 

import java.util.Scanner;

class Tax{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Price after tax : ");
		double afterTax = sc.nextDouble();
		System.out.print("Enter tax : ");
		double tax = sc.nextDouble();

		double beforeTax = afterTax * 100 / (100 + tax) ;
		System.out.println("Original price before tax is  : " + beforeTax);
	}
}