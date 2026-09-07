//Q2: Shopping Discount Story A customer buys a product and gets a discount %. Find final price.

import java.util.Scanner;

class ShoppingDiscount{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product amount:");
		double price=sc.nextDouble();
		System.out.println("Enter discount :");
		double discount=sc.nextDouble();
		double finalPrice=price-(price*discount/100);
		System.out.println(finalPrice);
		sc.close();
	}
}