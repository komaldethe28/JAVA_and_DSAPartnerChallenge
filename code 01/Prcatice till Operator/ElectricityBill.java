//Q52: Electricity bill is calculated based on units consumed and rate per unit.
import java.util.Scanner;
class ElectricityBill{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Unit used:-");
		float unit= sc.nextFloat();
		System.out.println("Enter rate per unit:-");
		float rate= sc.nextFloat();
		float  bill= unit* rate;
		System.out.println("Final Electricity Bill :-" +bill);
		sc.close();
	}
}