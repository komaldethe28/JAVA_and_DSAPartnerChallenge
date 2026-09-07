// Q7: GST Calculation Story A product has price and GST %. Find final price. 

import java.util.Scanner;

class GstCalculation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price: ");
		double price=sc.nextDouble();

		System.out.println("Enter the GST: ");
		double gst=sc.nextDouble();

		double finalPrice=price+(price*gst/100);
		System.out.println("Final Price is :"+finalPrice);
		sc.close();
	}
}