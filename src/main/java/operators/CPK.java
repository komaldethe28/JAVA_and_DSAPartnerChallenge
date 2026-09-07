/* Q.27 Cost per KM
Fuel cost and total distance are given. Find cost per km. */

class CPK
{
    public static void main(String args[])
    {
        double fuel_cost = 500 ;
        double total_dist = 100 ;

        double cost_per_km = fuel_cost / total_dist;

        System.out.println("The cost per KM is : " +cost_per_km);                                            
    }
}