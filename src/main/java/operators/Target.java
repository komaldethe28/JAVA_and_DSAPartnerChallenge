/* Q.28 Required marks to reach target..
A student needs certain total marks. Given marks already scored, find required marks. */

class Target 
{
    public static void main(String args[])
    {
        double target = 500 ;
        double scored = 350;

        double req_marks = target - scored;

        System.out.println("The required marks are : " +req_marks);
    }
}