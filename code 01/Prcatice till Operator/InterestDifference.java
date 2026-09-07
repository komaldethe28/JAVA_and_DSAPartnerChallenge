//Q57: Find difference between interest earned at two different rates.

import java.util.Scanner;
class InterestDifference{
 	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price:-"); 
	        double p = sc.nextDouble();

		System.out.println("Enter rate 1 and 2:- "); 
	        double r1 = sc.nextDouble();
	        double r2 = sc.nextDouble();

		System.out.println("Enter time:-"); 

	        double t = sc.nextDouble();

	        double i1 = (p * r1 * t) / 100;
	        double i2 = (p * r2 * t) / 100;
	        double diff = i1 - i2;
	        System.out.println(diff); 		
			sc.close();
	}
}