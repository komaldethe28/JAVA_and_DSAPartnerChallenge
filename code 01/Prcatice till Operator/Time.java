// Q39 : Given start time and end time in hours, find total time spent. 

import java.util.Scanner;

class Time{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Start time : ");
		double start = sc.nextDouble();
		System.out.print("Enter End time : ");
		double end = sc.nextDouble();
		double totalTime = end - start ;
		System.out.println("Total time spent is : " + totalTime + " hr");
		sc.close();
	}
}