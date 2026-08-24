class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class extendingthread {
    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.start();

        System.out.println("Main Thread");
    }
}