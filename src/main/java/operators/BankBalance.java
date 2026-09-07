// Q1: Bank Balance 📖 Story Ravi has some money in his account. He deposits and withdraws some amount. Find final balance.

import java.util.Scanner;

class BankBalance{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter balance:");
		double balance=sc.nextDouble();
		System.out.println("Enter balance:");
		double deposit=sc.nextDouble();
		System.out.println("Enter deposit:");
		double withdraw=sc.nextDouble();
		double finalBalance=balance+deposit-withdraw;
		System.out.println("Final balance is : "+finalBalance);
	}
}