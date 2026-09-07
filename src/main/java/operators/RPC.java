/* Q.26 Reverse Profit Calculation
Selling price and profit % are given. Find cost price. */

class RPC
{
    public static void main(String args[])
    {
        double sp = 1200;
        double profit_percent = 20;

        double cp = (sp * 100) / (100 + profit_percent);   

        System.out.println("The cost price is : " +cp);
    }
}