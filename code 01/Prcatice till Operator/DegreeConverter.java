import java.util.Scanner;
class DegreeConverter{
	public static void main (String [] args){
		try (Scanner sc= new Scanner(System.in)) {
			System.out.println("Enter the temperature in celsius:- ");
			double celsius = sc.nextDouble();

			double feh= (9.0/5)* celsius +32;
			System.out.println(celsius +" Celsius is " + feh +"Fahrenheit");
		}

	}
}