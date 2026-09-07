import java.util.Scanner;
class PalindronRec{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=sc.nextInt();
		int dup= num;
		Boolean op= isPalindrome(num,0, dup);
		System.out.print(op);
		System.out.print(op? " palindrome":" not palindrome");
		
	}
public static int isPalindrome(int num, int rev, int dup){
	if(num==0) return rev ==dup;
	rev=rev*10+num%10;
	return isPalindrome(num/10, rev, dup);
	}
}