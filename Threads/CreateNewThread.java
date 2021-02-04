import java.lang.Thread;

class ThreadOne extends Thread {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("\t From Child Thread 1 : i = " + i);
                Thread.sleep(600);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Child Thread 1 Interrupted");
        }
        System.out.println("Exit From Child Thread 1");
    }
}

class ThreadTwo extends Thread {
    public void run() {
        try {
            for(int j = 1; j <= 5; j++) {
                System.out.println("\t From Child Thread 2 : j = " + j);
                Thread.sleep(400);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Child Thread 2 Interrupted");
        }
        System.out.println("Exit From Child Thread 2");
    }
}

class ThreadThree extends Thread {
    public void run() {
        try {
            for(int k = 1; k <= 5; k++) {
                System.out.println("\t From Child Thread 3 : k = " + k);
                Thread.sleep(800);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Child Thread 3 Interrupted");
        }
        System.out.println("Exit From Child Thread 3");
    }
}

public class CreateNewThread {
    public static void main(String args[]) {
        ThreadOne a = new ThreadOne();
        a.start();
        ThreadTwo b = new ThreadTwo();
        b.start();
        ThreadThree c = new ThreadThree();
        c.start();
        try {
            for(int m = 1; m <= 5; m++) {
                System.out.println("\t From Main Thread : m = " + m);
                Thread.sleep(1200);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Interrupted");
        }
        System.out.println("Exit Form Main Thread");
    }
}