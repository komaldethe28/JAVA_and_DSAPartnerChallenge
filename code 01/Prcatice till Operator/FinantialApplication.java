import java.util.Scanner; 
class FinantialApplication{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter saving amount and annual_rate");
		double saving = sc.nextDouble(); //100
		double annual_rate = sc.nextDouble();//5;
		double month_rate = annual_rate/(12.0 * 100); // 5/12.0*100

		double savingTotal = 0;
		
		for( int i = 1; i<= 6; i++)
		{
			savingTotal = (saving+savingTotal) * ( 1 + month_rate );
		}
		
		System.out.printf("The account value after 6 month is %.3f " , savingTotal);
		sc.close();
	}
}
