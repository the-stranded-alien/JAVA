import java.lang.Thread;

class MainThread {
    public static void main(String args[]) {
        Thread threadObj = Thread.currentThread();
        System.out.println("Current Thread : " + threadObj);
        
        threadObj.setName("New Thread");
        System.out.println("Renamed Thread : " + threadObj);
    }
}