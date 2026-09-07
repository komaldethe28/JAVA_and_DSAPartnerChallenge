import java.util.Scanner;
class Energy{
	public static void main(String [] args){
	try (Scanner sc= new Scanner(System.in)) {
		System.out.println("Enter the amount of water in kilogram:");
		double m= sc.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		double initialTemp= sc.nextDouble();

		System.out.println("Enter the final temperature: ");
		double finalTemp= sc.nextDouble();

		double energy= m * (finalTemp - initialTemp) * 4184;
		
		System.out.println("The energy needed is " +energy);
	}
	}
}