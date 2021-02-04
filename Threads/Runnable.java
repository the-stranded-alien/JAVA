import java.lang.Thread;

class ThreadChild implements Runnable {
    ThreadChild() {
        Thread t = new Thread(this, "Example Thread");
        System.out.println("Detail of Child Thread : " + t);
        t.start();
    }
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("\t From Child Thread 1 : i = " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println("Child Thread 1 Interrupted");
        }
        System.out.println("Exit From Child Thread 1");
    }
}

class Runnable {
    public static void main(String args[]) {
        new ThreadChild();
        try {
            for(int m = 1; m <= 5; m++) {
                System.out.println("\t From Main Thread : m = " + m);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Main Interrupted");
        }
        System.out.println("Exit From Main Thread");
    }
}