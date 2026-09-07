//Q58: Total time and number of tasks are given. Find average time per task.

import java.util.Scanner;

class AverageTimeperTask {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter total time:-");
            double totalTime = sc.nextDouble();

            System.out.println("Enter number of tasks:-");
            double tasks = sc.nextDouble();

            double avg = totalTime / tasks;

            System.out.println("Average time per task is:- " + avg);
		}
	}
}