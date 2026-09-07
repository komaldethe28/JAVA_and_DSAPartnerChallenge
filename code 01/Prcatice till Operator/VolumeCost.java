//51. A box has length, width, height. Cost is based on volume (₹ per unit³). Find total cost.

import java.util.Scanner;

class VolumeCost {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter length of Box:-");
            float length = sc.nextFloat();

            System.out.println("Enter width of Box:-");
            float width = sc.nextFloat();

            System.out.println("Enter height of Box:-");
            float height = sc.nextFloat();

            System.out.println("Enter Cost Per Unit of Box:-");
            float costPerUnit = sc.nextFloat();

            float volume = length * width * height;
            float total = volume * costPerUnit;

            System.out.println("Total cost of Box is:- " + total);
        }
    }
}