package homeworks.homework1;

import lombok.Getter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multithreading {
    public static void main(String[] args) {
        Variable variable = new Variable();
        Runnable runnable = variable::inc;

        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            service.execute(runnable);
        }

/*      можно создавать самому потоки, но это неудобно

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
*/
        service.shutdown();
        while (!service.isTerminated()) {
        }

        System.out.println(variable.getX());
    }
}

@Getter
class Variable {
    private int x = 1;

    public synchronized void inc() {
        for (int i = 0; i < 10_000; i++) {
            x += 1;
        }
    }
}

