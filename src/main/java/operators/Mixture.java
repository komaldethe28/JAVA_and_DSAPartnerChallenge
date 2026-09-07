/* Q.31 Mixture Concentration..
You mix 2 litres of juice with 30% concentration and 3 litres with 50%. Find final 
concentration %. */

class Mixture
{
    public static void main(String args[])
    {
        double first_Qty = 2;
        double first_conc = 30;

        double second_conc = 50;
        double second_Qty = 3;

        double total_Qty = first_Qty + second_Qty;

        double total_pure = (first_Qty * first_conc / 100) + (second_Qty * second_conc / 100) ;
        double final_conc = (total_pure / total_Qty) * 100;

        System.out.println("The final concentration is :" +final_conc); 
    }
}