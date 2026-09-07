import java.util.Scanner;
class RunwayLength{
	public static void main(String [] args){
		try (Scanner sc= new Scanner(System.in)) {
			System.out.print("Enter speed and acceleration:- ");
			double v= sc.nextDouble();		
			double a= sc.nextDouble();

			double l= (v*v)/(2*a);

			System.out.println("The minimum runway length for tis airplane is:- " + l);
		}
		
	}
}