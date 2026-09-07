// Q55: A driver makes 3 trips of different distances. Find total fuel used.

import java.util.Scanner;
class TotalFuelforMultipleTrips{
	public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		 System.out.println("Enter distance of three trips:-"); 
	         double d1 = sc.nextDouble();
	        double d2 = sc.nextDouble();
	        double d3 = sc.nextDouble();
	        double mileage = sc.nextDouble();
	       double totalDist = d1 + d2 + d3;
	       double fuel = totalDist / mileage; 
	       System.out.println("total fuel used:-" +fuel);
}
}