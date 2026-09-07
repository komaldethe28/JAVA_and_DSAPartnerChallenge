import java.util.*;
class RecRevNum{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int num= sc.nextInt();
		int rev= reverseNum(num,0);
		System.out.println(rev);
	}
	public static int reverseNum(int num, int rev){
		int rem= num%10;
		rev =rev*10 +rem;
		num=num/10;
		if(num==0) return rev;
		return reverseNum(num,rev);
	}
}