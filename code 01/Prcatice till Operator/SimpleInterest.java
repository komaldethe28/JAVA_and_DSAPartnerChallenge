//Q3: Simple Interest Story A person invests money in a bank. Find interest earned. 

import java.util.Scanner;

class SimpleInterest{
	public static void main(String[] args){
		try (Scanner sc=new Scanner(System.in)) {
			System.out.println("Enter the amount:");
			double p=sc.nextDouble();
			System.out.println("Enter the rate:");
			double r=sc.nextDouble();
			System.out.print("Enter the time:");
			double t=sc.nextDouble();
			double simpleInterest=(p*r*t)/100;
			System.out.println(simpleInterest);
		}
	}
}