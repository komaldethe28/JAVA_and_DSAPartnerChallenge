// Q40 : A product has two successive discounts. Find final price.

import java.util.Scanner;

class Discount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Price of product : ");
		double price = sc.nextDouble();
		System.out.print("Enter Discount 1 : ");
		double discount1 = sc.nextDouble();
		System.out.print("Enter Discount 2 : ");
		double discount2 = sc.nextDouble();

		double afterFirst = price - (price * discount1 / 100);
		double afterSecond = afterFirst - (afterFirst * discount2 / 100);

		System.out.println("Final price is : " + afterSecond);
	}
}