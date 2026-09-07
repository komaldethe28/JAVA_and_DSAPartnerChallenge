/* Q.35 Currency Conversion Chain..
Convert USD → INR → add conversion fee → find final INR. */
class Currency
{
    public static void main(String args[])
    {
        double usd = 10 ; 
        double rate = 80 ; 
        double fee = 2 ; 
 
        double inr = usd * rate; 
        double finalAmt = inr + (inr * fee / 100); 
 
       System.out.println(finalAmt);
    }
}