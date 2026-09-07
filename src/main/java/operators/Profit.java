// Q42 : A shopkeeper sells at 20% profit and selling price is ₹1200. Find cost price.

import java.util.Scanner;

class Profit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Selling price : ");
		double sp = sc.nextDouble();
		System.out.print("Enter profit : ");
		double profit = sc.nextDouble();

		double cp = sp * 100 / (100 + profit) ;
		System.out.println("Cost price is : " + cp);
	}
}