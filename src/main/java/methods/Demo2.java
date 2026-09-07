//class as Final ->

final class Ramesh {
    String str = "Parents";

    public void m1() {
        System.out.println("m1() from Parents");
    }

    public void m2() {
        System.out.println("m2() from Parents");
    }

    public void m3() {
        System.out.println("m3() from Parents");
    }
}

class Demo2 {
    public static void main(String[] args) {
        Ramesh obj = new Ramesh();
        System.out.println(obj.str);
        obj.m1();
    }
}
