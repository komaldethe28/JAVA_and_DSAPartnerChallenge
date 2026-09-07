// Q46 : Income is given. Expenses are given. Find savings per month and yearly savings.


import java.util.Scanner;
class Income{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Income : ");
		double income = sc.nextDouble();
		System.out.print("Enter Expenses : ");
		double expenses = sc.nextDouble();
		
		
		double savings = income - expenses;
		double yearly = savings * 12;	

		System.out.println("Monthly Savings is : " + savings);
		System.out.println("Yearly Savings is : " + yearly);
		sc.close();

	}
}