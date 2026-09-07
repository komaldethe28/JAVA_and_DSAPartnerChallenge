import java.util.Scanner;
class FinancialApp{
	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the subtotal ");
	float subtotal = sc.nextFloat();
	System.out.println("Enter the gratuityRate ");
	
	float gratuityRate = sc.nextFloat();

	float gratuity= gratuityRate * subtotal  / 100;
	float total= subtotal + gratuity;

	System.out.printf("the tip is %.1f and a total is %.3f %n" , gratuityRate, total);
	}
}