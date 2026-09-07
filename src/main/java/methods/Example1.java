// Synchronized non-access modifier

class Example1 {

    public static void main(String[] args)
            throws InterruptedException {

        Task task = new Task();

        MyThread t1 = new MyThread("Ramesh", task);
        t1.start();

        MyThread t2 = new MyThread("Suresh", task);
        t2.start();
    }
}

class MyThread extends Thread {

    String threadName;
    Task task;

    MyThread(String threadName, Task task) {
        this.threadName = threadName;
        this.task = task;
    }

    @Override
    public void run() {

        try {
            task.printNum(threadName);
        } catch (InterruptedException ie) {
            System.out.println("Something went wrong");
        }
    }
}

class Task {

    public synchronized void printNum(String threadName)
            throws InterruptedException {

        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " : " + i);
            Thread.sleep(1000);
        }
    }
}