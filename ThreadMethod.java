class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running...");
    }
}

public class ThreadMethod {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.start();

        System.out.println("Main thread is running...");
    }
}