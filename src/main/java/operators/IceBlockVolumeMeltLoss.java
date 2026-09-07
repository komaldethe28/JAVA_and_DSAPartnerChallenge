//Q60: An ice cube melts and loses some percentage of volume. Find remaining volume.
import java.util.Scanner;
class IceBlockVolumeMeltLoss{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter volume:-");   
	double volume = sc.nextDouble();

	System.out.println("Enter loss:-");   
	double loss = sc.nextDouble();

	double remaining = volume - (volume * loss / 100);
	System.out.println("remaining volume is:" +remaining); 
	} 
}