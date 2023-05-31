package Multithreading.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author cat
 */
public class UseThreadLocal {
    public static ThreadLocal<Long> threadLocal = ThreadLocal.withInitial(() -> Thread.currentThread().getId());

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(threadLocal.get())).start();
        }
        TimeUnit.SECONDS.sleep(5);
    }

}
