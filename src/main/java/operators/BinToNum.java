import java.util.Scanner;
class BinToNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        String bin = Integer.toBinaryString(num);
        int num2 = Integer.parseInt(bin,2);
        System.out.println(num+":"+bin+":"+num2);
        sc.close();
    }
}