import java.util.Scanner;
class Acceleration
{
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter initial and final velocity in m/s");
			double initial = sc.nextDouble();
			double final_v = sc.nextDouble();
			System.out.println("Enter time taken in seconds");
			double time = sc.nextDouble();
			double acceleration = (final_v - initial)/time;
			System.out.printf("The acceleration is %.4f", acceleration);
		}
		
	}
}