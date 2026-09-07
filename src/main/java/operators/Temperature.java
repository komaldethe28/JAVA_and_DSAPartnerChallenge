/* Q.36 Temperature Conversion Chain 
Convert Celsius → Fahrenheit → increase by some %. Find final value. */

class Temperature
{
    public static void main(String args[])
    {
        double c = 0 ; 
        double inc = 10 ; 
 
        double f = (c * 9 / 5) + 32; 
        double finalTemp = f + (f * inc / 100); 
 
        System.out.println(finalTemp); 
    }
}