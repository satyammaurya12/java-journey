
class A extends Thread {

    public void run() {
        try {
            Thread.sleep(500);
            System.out.println("Running ");

        } catch (Exception e) {
        }

    }
}

class threadlifecycle {

    public static void main(String[] args) throws Exception {
        A t = new A();
        System.out.println("t.getState");
        t.start();
        Thread.sleep(100);
        System.out.println(t.getState());
        t.join();
        System.out.println(t.getState());
    }
}
