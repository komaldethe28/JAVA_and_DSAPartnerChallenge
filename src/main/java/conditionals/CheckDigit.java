import java.util.Scanner;

class CheckDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = (ch >= 48 && ch <= 57)
                ? ch + " is a Digit"
                : ch + " is not a Digit";

        System.out.println(result);
    }
}