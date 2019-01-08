package com.rabbitmq.thead;

public class TaskTest implements Runnable {
    public void run() {
        System.out.println(TheadPoolTest.print.incrementAndGet());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
