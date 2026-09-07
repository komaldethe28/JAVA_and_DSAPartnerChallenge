import java.util.Scanner;
class Power{
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=sc.nextInt();
		System.out.print("Enter a Power:");
		int pow=sc.nextInt();
		System.out.println(isPower(num, pow, 1));
		sc.close();
	}
public static int isPower(int num, int pow, int ans ){
	if (pow==0) return ans;
	if (pow < 0) throw new IllegalArgumentException("Power must be non-negative");
	return isPower(num, pow - 1, ans * num);
	}
}