import java.util.Scanner;

class Condition {
	public static void main (String [] args){
	 Scanner sc= new Scanner(System.in);
	System.out.print ("Enter a Character:- ");
	char ch= sc.next().charAt(0);

	String op= 
( ch >= 65&&ch<=90 || ch >= 97&&ch<=122 )? 
(ch >= 65&&ch<=90 ?  
ch + "is upper character" :
ch + "is lower character" ) :
( ch >= 48&&ch<=57 )?
ch + "is Digit" :
ch + "is not Digit" ;

System.out.println(op);
	}
}


/*   java Condition.java
Enter a Character:- A
A is upper character

D:\Jspider\TernaryOperator>java Condition.java
Enter a Character:- a
a is lower character

D:\Jspider\TernaryOperator>java Condition.java
Enter a Character:- 1
1 is Digit

D:\Jspider\TernaryOperator>java Condition.java
Enter a Character:- #
# is not Digit

*/