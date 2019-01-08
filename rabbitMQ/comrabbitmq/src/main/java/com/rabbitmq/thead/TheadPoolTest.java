package com.rabbitmq.thead;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TheadPoolTest {
    private static final ExecutorService executor = new ThreadPoolExecutor(0, 3, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2));
    public static AtomicInteger print = new AtomicInteger(0);

    public static void main(String[] args) {
        for (int i = 0 ; i < 10; i ++) {
            executor.execute(new TaskTest());

        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void testE() {

    }
}
