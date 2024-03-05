package all_java;
public class MyThread extends Thread {
    public void run() {
        System.out.println("Vansh's Thread is running!!!");
    }

    public static void main(String[] args) {
        System.out.print("\033c");
        MyThread mt = new MyThread();
        // new
        System.out.println("The New state is: " + mt.getState());
        mt.start();
        //run
        System.out.println("The Runnable state is: " + mt.getState());
        try {
            mt.join();
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("After execution state: " + mt.getState());
        System.out.println("Terminal state: " + mt.getState());
    }
}
