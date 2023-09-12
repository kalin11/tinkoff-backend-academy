package homeworks.homework1;

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        Variable variable = new Variable();
        Runnable runnable = variable::inc;

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(variable.getX());
    }
}

class Variable {
    private volatile int x = 1;

    public int getX() {
        return x;
    }

    public synchronized void inc() {
        for (int i = 0; i < 10_000; i++) {
            x += 1;
        }
    }
}

