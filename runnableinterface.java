class MyRunnable implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
        }
    }
}

public class runnableinterface {
    public static void main(String[] args) {

        MyRunnable obj = new MyRunnable();

        Thread t = new Thread(obj);

        t.start();

        System.out.println("Main Thread");
    }
}