// Q48 : Given total distance and speed, find time taken in hours.

import java.util.Scanner;

class Hours{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total distance : ");
		double distance = sc.nextDouble();
		System.out.print("Speed : ");
		double speed = sc.nextDouble();

		double time = distance / speed ;

		System.out.println("Time taken : " + time + "hrs");
		sc.close();
	}
}