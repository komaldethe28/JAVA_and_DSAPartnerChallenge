// Q45 : A 10L mixture has 40% juice. If 2L pure juice is added, find new percentage. 

import java.util.Scanner;

class Percentage{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total Mixture : ");
		double totalMix = sc.nextDouble();
		System.out.print("Enter percent : ");
		double percent = sc.nextDouble();
		System.out.print("Enter added : ");
		double added = sc.nextDouble();

		double pure = totalMix * percent / 100;
		double newPure = pure + added;
		double newTotal = totalMix + added;

		double newPercentage = (newPure / newTotal) * 100;

		System.out.println("New Percentage is : " + newPercentage);
	}
}