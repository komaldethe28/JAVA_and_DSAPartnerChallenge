// Q54: Cost to paint a square depends on area. Given side and cost per unit area.
import java.util.Scanner;
class SquareCostCalculation{
public static void main (String[] args){
		Scanner sc = new Scanner(System.in);      
		System.out.println("Enter side:-");
		double side = sc.nextDouble();   
 		double area = side* side;

		System.out.println("Enter cost per unit area:-");
		double cost = sc.nextDouble();   
    
		double totalCost = area* cost;   
    System.out.println("Total Cost :-"+totalCost); 
		sc.close();
		
}
}