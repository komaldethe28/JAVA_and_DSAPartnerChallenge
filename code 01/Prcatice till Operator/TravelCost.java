// Q5: Travel Cost Story Find fuel cost for a trip using distance, mileage, and fuel price. 

import java.util.Scanner;

class TravelCost{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance:");
		double distance=sc.nextDouble();
		System.out.println("Enter mileage");
		double mileage=sc.nextDouble();
		System.out.println("Enter the price:");
		double price=sc.nextDouble();
		double fuel=distance/mileage;
		double cost=fuel*price;
		System.out.println("Fuel cost is : "+cost);
		sc.close();
	}
}