//Q12: Bill + Discount + GST 📖 Story A customer buys items worth some amount. He gets discount, then GST is applied. Find final bill. 

import java.util.Scanner;
class BillDiscount{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amountu: ");
		double amount=sc.nextDouble();
		System.out.println("Enter the discount: ");
		double discount=sc.nextDouble();
		System.out.println("Enter the gst: ");
		double gst=sc.nextDouble();
		double afterDiscount=amount-(amount*discount/100);
		double finalAmount=afterDiscount+(afterDiscount*gst/100);
		System.out.println("Final salary is : "+finalAmount);
	}
}