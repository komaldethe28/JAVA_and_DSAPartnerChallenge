/* Q.29 Compound Growth..
Money grows 3 times with same rate applied sequentially. */

class Money
{
    public static void main(String args[])
    {
        double money = 1000;
        double rate = 10;

        double growth1 = money + (money * rate / 100);
        double growth2 = growth1 + (growth1 * rate / 100);
        double growth3 = growth2 + (growth2 * rate / 100);

        System.out.println("The final growth is :" +growth3);
    }
}