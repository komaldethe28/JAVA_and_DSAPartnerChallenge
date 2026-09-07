//Q6: Average Marks Story Find average marks of a student in 3 subjects. 

import java.util.Scanner;

class AvgMarks{
	public static void main(String[] argss){
		try (Scanner sc=new Scanner(System.in)) {
			System.out.println("Enter subject 1 marks: ");
			double s1=sc.nextDouble();
			System.out.println("Enter subject 2 marks: ");
			double s2=sc.nextDouble();
			System.out.println("Enter subject 3 marks: ");
			double s3=sc.nextDouble();
			double avg=(s1+s2+s3)/3;
			System.out.println("Average marks are: "+avg);
		}
	}
}