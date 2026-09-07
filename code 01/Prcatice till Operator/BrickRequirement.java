// Q53: A wall area is given. Each brick covers certain area. Find number of bricks needed.
import java.util.Scanner;
class BrickRequirement{
	public static void main(String [] args){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter wall area:-");
			double wallArea = sc.nextDouble();

			System.out.println("Enter brick area:-");

			double brickArea = sc.nextDouble();
			double bricks = wallArea / brickArea;
			System.out.println("bricks needed :-"+bricks);
		}
	}
}

   