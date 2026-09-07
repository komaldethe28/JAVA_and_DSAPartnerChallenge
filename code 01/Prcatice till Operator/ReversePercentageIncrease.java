//49. Final value after 25% increase is given. Find original value.
import java.util.Scanner;
class ReversePercentageIncrease{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter Final Value:-");
		double finalValue = sc.nextDouble();      
			System.out.println("Enter increase:-");
		double inc = sc.nextDouble();     
		double originalValue = finalValue * 100 / (100 + inc);     
		System.out.println(originalValue);   
		sc.close();
}}

