// Q38 : Land area is given. Cost per unit area is given. Find total cost.

import java.util.Scanner;

class Cost{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Land area : ");
		double area = sc.nextDouble();

		System.out.print("Enter Cost per unit :");
		double cost = sc.nextDouble();

		double totalCost = area * cost;
		System.out.println("Total cost is : " + totalCost);

	}
}