/* Q.32 Work rate..
Worker A completes a job in 10 days, B in 20 days. Find days taken together. */

class Work
{
    public static void main(String args[])
    {
        double a = 10 ; 
        double b = 20 ; 
 
        double rate = (1 / a) + (1 / b); 
        double days = 1 / rate; 
 
        System.out.println("Days : " +days); 
    }
}