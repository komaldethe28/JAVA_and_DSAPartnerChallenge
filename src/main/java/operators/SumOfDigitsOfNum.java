import java.util.Scanner;
class SumOfDigitsOfNum{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int digit = sc.nextInt();
		
		int sum = 0;
		 while (digit > 0) {
         		 sum = sum + (digit % 10); // Get last digit
            		digit = digit / 10;       // Remove last digit
        }
		System.out.println("the sum of the digits is: " + sum);
	}
}