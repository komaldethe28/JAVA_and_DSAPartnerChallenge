//Volatile non-access modifier

class DriverExample {

    volatile static int a = 10;
    public static void main(String[] args) {

        Ramesh t1 = new Ramesh();
        t1.start();

        Suresh t2 = new Suresh();
        t2.start();
    }
}

class Ramesh extends Thread {
    @Override
    public void run() {

        System.out.println("Ramesh Starts");
        while (true) {
            if (DriverExample.a != 10)
                break;
        }
       System.out.println("Ramesh Ends");
    }
}

class Suresh extends Thread {
    @Override
    public void run() {
        System.out.println("Suresh Starts");
        try {
            Thread.sleep(5000);
            DriverExample.a = 20;
            System.out.println("Updated value : " + DriverExample.a);
        } catch (InterruptedException ie) {
            System.out.println("I got interrupted");
        }
        System.out.println("Suresh Ends");
    }
}