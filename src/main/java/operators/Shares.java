// Q47 : Total ₹1200 is divided in ratio 2:3:7. Find all shares. 


import java.util.Scanner;
class Shares{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total : ");
		double total = sc.nextDouble();
		System.out.print("Enter a : ");
		double a = sc.nextDouble();
		System.out.print("Enter b : ");
		double b = sc.nextDouble();
		System.out.print("Enter c : ");
		double c = sc.nextDouble();
		
		double sum = a+b+c;

		double s1 = total * a / sum;
		double s2 = total * b / sum;
		double s3 = total * c / sum;

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}