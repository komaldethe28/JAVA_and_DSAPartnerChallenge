// Q4: Pizza Distribution Story Pizza slices are shared equally among friends. Find slices each gets and remaining. 

import java.util.Scanner;

class PizzaDistribution{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of slices:");
		int slices=sc.nextInt();
		System.out.println("Enter number of friends:");
		int friends=sc.nextInt();
		int each=slices/friends;
		System.out.println("each will get: " + each);
		int remaining=slices%friends;
		System.out.println("remaining is "+remaining);
		sc.close();
	}
}