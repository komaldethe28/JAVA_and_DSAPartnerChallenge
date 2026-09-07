import java.util.Scanner;
class PoundsIntoKG{
	public static void main(String [] args ){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a number in pounds:-");

	double pou= sc.nextDouble();
	double kg= pou*0.454;
	System.out.println(pou + "pounds is " + kg + "kilograms");
	sc.close();
	
	}
}