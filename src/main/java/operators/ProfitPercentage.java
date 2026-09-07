// Q10: Profit Percentage Story Find profit percentage from cost price and selling price. 
 
import java.util.Scanner;

class ProfitPercentage{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cost price: ");
		double cp=sc.nextDouble();
		System.out.println("Enter selling price: ");
		double sp=sc.nextDouble();
		double profit=((sp-cp)/cp)*100;
		System.out.println("Profit percentage is : "+profit + "%");
	}
}