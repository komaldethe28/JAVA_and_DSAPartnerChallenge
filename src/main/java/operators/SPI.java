/* Q.25 Successive Percentage Increase..
Price increases by 10% and then again by 20%. Find final value. */

class SPI
{
    public static void main(String args[])
    {
        double value = 100;

        double first_incr = value + (value * 10 / 100);     
        double second_incr = first_incr + (first_incr * 20 / 100);

        double final_val = second_incr;

        System.out.println("The final value is : " +final_val);
    }
}