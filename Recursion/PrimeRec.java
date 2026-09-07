import java.util.Scanner;
class PrimeRec{
	public static void main(String[] args){
		try (Scanner sc= new Scanner(System.in)) {
			System.out.print("Enter a number:"); 
			int num= sc.nextInt();
			boolean op= isPrime(num,2);
			System.out.print(op? num+ " Prime" : num+ " not Prime"); 
		}
	}
	public static Boolean isPrime(int num, int i){
		if(num%i==0 && num!= 2 || num<2) return true;
		if(i>num/2) return true;
		return isPrime(num , ++i);
	}
}