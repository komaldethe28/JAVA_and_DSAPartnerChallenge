/*
Q21: Original Price from Discounted Price
Story
A product is sold after a discount. You are given final price and discount %. Find original
price.
*/

class OriginalPrice {
    public static void main(String[] args) {
        double finalPrice=900;//price after discount
        double discount=0.10;  //10%
        double originalPrice=finalPrice/(1-discount); // x - x*10% = 900  => x(1-0.1) = 900  =>  x(0.9)=900 => x =900/0.9 =>1000
        System.out.println("Original Price :"+originalPrice);

    }
}