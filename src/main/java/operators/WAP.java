/* Q.33 Weighted Average Price..
Buy 2kg apples at ₹100/kg and 3kg at ₹120/kg. Find average price per kg. */

class WAP
{
    public static void main(String args[])
    {
        
        double q1 = 2 ; 
        double p1 = 100 ; 
        double q2 = 3 ; 
        double p2 = 120; 
 
        double totalCost = (q1 * p1) + (q2 * p2); 
        double totalQty = q1 + q2; 
 
        double avg = totalCost / totalQty; 
 
        System.out.println("Average : " +avg); 
    }
}