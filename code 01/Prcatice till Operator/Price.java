 import java.util.Scanner;
class Price
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance to drive and fuel efficiency in miles per gallon "); 
		double distance = sc.nextDouble(); 
		double fuelEfficiency = sc.nextDouble(); 
		System.out.println("Enter the price per gallon");
		double price = sc.nextDouble();
		price = distance*price/fuelEfficiency;
		System.out.printf("The cost of driving is %.2f",price);
		sc.close();
 
	}
}