// Q43 : Given hours and minutes, convert into total seconds. 

import java.util.Scanner;

class Second{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Hours : ");
		int hours = sc.nextInt();
		System.out.print("Enter Minutes : ");
		int minutes = sc.nextInt();

		int second = (hours * 60 * 60) + (minutes * 60);
		System.out.println("Total seconds : " + second);
	}
}