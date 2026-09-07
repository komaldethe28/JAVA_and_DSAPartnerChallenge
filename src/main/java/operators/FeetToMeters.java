import java.util.Scanner;
class FeetToMeters{
	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a value for feet :- ");
	double feet = sc.nextDouble();
	
	double meters= feet*0.305;
	System.out.println(feet + " feet is :-" +meters +" meters");
	}
}