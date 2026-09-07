// Q37 : Total salary is split among 3 people in ratio 2:3:5. Find share of third person.


import java.util.Scanner;
class Salary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Salary : ");
		double Salary = sc.nextDouble();
		System.out.print("Enter a : ");
		double a = sc.nextDouble();
		System.out.print("Enter b : ");
		double b = sc.nextDouble();
		System.out.print("Enter c : ");
		double c = sc.nextDouble();
		
		double share = Salary / (a+b+c);
		double thirdPerson = share * c;	
		System.out.println("Share of third person is : " + thirdPerson);
	}
}