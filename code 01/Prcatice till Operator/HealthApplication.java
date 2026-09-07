import java.util.Scanner;

class HealthApplication {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter weight in pounds:");
            double wPounds = sc.nextDouble();
            double wKg = wPounds * 0.45359237;

            System.out.println("Enter height in inches:");
            double hInch = sc.nextDouble();
            double hMeters = hInch * 0.0254;

            double bmi = wKg / (hMeters * hMeters);
            System.out.println("BMI:" + bmi);
        }
    }
}
