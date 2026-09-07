import java.util.Scanner;
class Circle{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the radius :- ");
		double radius= sc.nextDouble();
		final Double PI =22/7.0;
		double area =PI * radius * radius;
		double parimeter = 2 * radius * PI;
		
		System.out.println("The radius of Circle is :-" + radius);
		System.out.printf("Area : %.3f cm^2 %n", area);
		System.out.println("Parimeter :- " + parimeter +"cm");

   }
}