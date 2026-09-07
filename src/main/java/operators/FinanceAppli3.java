import java.util.Scanner;
class FinanceAppli3{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);

	System.out.println("Enter Balance-");
		double  balance= sc.nextDouble();
	
	System.out.println("Enter Interest Rate:");
		double  interestRate= sc.nextDouble();

	double  intrest= balance * (interestRate /1200);
	System.out.println("The Interest is Interest:-" +intrest);


}}