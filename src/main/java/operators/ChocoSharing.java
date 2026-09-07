// Q9: Chocolate Sharing Story Chocolates are distributed among students equally. Find each share and leftover. 
 
import java.util.Scanner;

class ChocoSharing{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of chocolates:");
		int choco=sc.nextInt();
		System.out.println("Enter the number of students:");
		int students=sc.nextInt();
		int each=choco/students;
		System.out.println("each share is : "+each);
		int left=choco%students;
		System.out.println("left choco are : "+left);
	}
}