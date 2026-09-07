public class StringDemo {

    public static void main(String[] args) {

        // Example 1 : String Literal
        String a = "Hello";
        String b = "Hello";
        System.out.println("Example 1: String Literal");
        System.out.println("a == b : " + (a == b));
        System.out.println("a.equals(b) : " + a.equals(b));

        // Example 2 : new String()
        String c = new String("Hello");
        String d = new String("Hello");
        System.out.println("\nExample 2: new String()");
        System.out.println("c == d : " + (c == d));
        System.out.println("c.equals(d) : " + c.equals(d));

        // Example 3 : Literal + new
        String e = "Java";
        String f = new String("Java");
        System.out.println("\nExample 3: Literal + new");
        System.out.println("e == f : " + (e == f));
        System.out.println("e.equals(f) : " + e.equals(f));

        // Example 4 : intern()
        String g = new String("Java");
        String h = g.intern();
        System.out.println("\nExample 4: intern()");
        System.out.println("g == h : " + (g == h));
        System.out.println("g.equals(h) : " + g.equals(h));

       // Example 5 : Immutability
       String s = "Hi";
        System.out.println("\nBefore concat : " + s);
        s.concat(" Everyone");   // ignored
        System.out.println("After concat (without storing) : " + s);
        s = s.concat(" Everyone");
        System.out.println("After storing : " + s);
    }
}