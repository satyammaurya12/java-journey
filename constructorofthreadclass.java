class MyThread extends Thread{

    public MyThread( String name) {
        super(name);
    }
    public void run(){
        System.out.println("Thread name: " +getName());
    }
    
}
public class constructorofthreadclass{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("MyThread-1");
        t1.start();
    }
}