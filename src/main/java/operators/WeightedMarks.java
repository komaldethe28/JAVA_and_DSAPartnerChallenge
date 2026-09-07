// Q56: Marks have different weights. Find final weighted score.
import java.util.Scanner;
class WeightedMarks{
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks and weight:-"); 

	         double m1 = sc.nextDouble();
	        double w1 = sc.nextDouble(); 
	        double m2 = sc.nextDouble();
	        double w2 = sc.nextDouble();
	        double total = (m1 * w1 + m2 * w2) / (w1 + w2);
	
	        System.out.println("final weighted score is:-" +total); 
	}
}