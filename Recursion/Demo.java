/* import java.util.Scanner;
class Demo{
	public static void main(String[] args ){
		System.out.print("Enter a number:");
		int num = new Scanner (System.in).nextInt();
		findFactors(1,num);
}
public static void findFactors(int start, int end){
 	if(end%start==0) System.out.print(start+ " ");
	if(start>end) return;
	findFactors(++start, end); 
}
}
*/

import java.util.Scanner;
class Demo{
	static int cnt=0;
	public static void main(String[] args ){
		System.out.print("Enter a number:");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			findFactors(1,num);
			System.out.print(cnt==2? num+ " is Prime" :num+ " is not prime");
		}
}
public static void findFactors(int start, int end){
 	if(end%start==0) cnt++;
	if(start>end) return;
	findFactors(++start, end); 
}
}