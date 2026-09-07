//50. A product is sold at a loss %. Find final selling price.
import java.util.Scanner;
class TotalCostWithLoss{
	public static void main(String [] args){
		try (Scanner sc= new Scanner(System.in)) {
			System.out.println("Enter product sold value:-");
			double saleVal=sc.nextDouble();

			System.out.println("Enter loss % :-");
			double lossPercentage= sc.nextDouble();

	 		double finalPrice = saleVal - (saleVal * lossPercentage / 100); 
			System.out.println("Final Selling Price is :-"+ finalPrice);
		}
	}
}