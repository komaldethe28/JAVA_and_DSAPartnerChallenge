// Q44 : Given fuel cost, price per litre, and mileage, find total distance traveled. 

import java.util.Scanner;

class Travel{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Fuel cost : ");
		double fuelCost = sc.nextDouble();
		System.out.print("Enter Price : ");
		double price = sc.nextDouble();
		System.out.print("Enter Mileage : ");
		double mileage = sc.nextDouble();

		double fuel = fuelCost / price ;
		double distance = fuel * mileage;

		System.out.println("Total distance traveled is : " + distance);
	}
}