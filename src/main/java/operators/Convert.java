/* Q.30 Convert minutes into number of days..
Convert total minutes into number of days. */
class Convert
{
    public static void main(String args[])
    {
        int mins = 1440;

        int days = mins / (60 * 24);

        System.out.println("Number of days :" +days);
    }
}