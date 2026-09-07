import java.util.Scanner;

class CheckAlphabet {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);

            String result = (ch >= 65 && ch <= 90) ?
                    ch + " is Uppercase Alphabet":                      //true
                	(ch >= 97 && ch <= 122) ?                               //false
                    ch + " is a Lowercase Alphabet":
                    ch + " is not an Alphabet";                            //other

            System.out.println(result);
        }
    }
}