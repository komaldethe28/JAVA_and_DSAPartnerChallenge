//Find area of triangle using base and height.

import java.util.Scanner; 
class TriangleArea{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
	System.out.println("Enter base:-");   
	double base = sc.nextDouble();        
        System.out.println("Enter height:-");
	double height = sc.nextDouble();         
	double area = (base * height) / 2;         
	System.out.println("area is:-" +area);    
		sc.close();
	}
} 