package homeworks.homework1.task3;

import lombok.Getter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Multithreading {
    public static void main(String[] args) {
        AtomicInteger x = new AtomicInteger(1);
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            service.execute(() -> {
                for (int j = 0; j < 10_000; j++) {
                    x.incrementAndGet();
                    System.out.println("Thread " + Thread.currentThread().getName() + " count " + x.get());
                }
            });
        }

        // disable new tasks from being submitted
        try {
            service.shutdown();
            if (!service.awaitTermination(60, TimeUnit.SECONDS)) {
                System.out.println("Can't stop executing");
            }
            else {
                System.out.println(x.get());
            }
        }catch (InterruptedException e) {
            System.err.println("Some problems");
        }
    }
}

