//Q11: Salary + Bonus + Tax : An employee has a salary. He gets a bonus, but tax is deducted on total income. Find final take-home salary.  
 
import java.util.Scanner;
class BonusTax{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary: ");
		double salary=sc.nextDouble();
		System.out.println("Enter the bonus: ");
		double bonus=sc.nextDouble();
		System.out.println("Enter the tax: ");
		double tax=sc.nextDouble();
		double total=salary+bonus;
		double finalSalary=total-(total*tax/100);
		System.out.println("Final salary is : "+finalSalary);
	}
}