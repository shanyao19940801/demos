package com.rabbitmq;

import java.util.HashMap;

public class ProducerTest {
    public static void main(String[] args) {
        try {
            /*QueueConsumer consumer = new QueueConsumer("queue");
            Thread consumerThread = new Thread(consumer);
            consumerThread.start();*/

            Producer_Remote producer_remote = new Producer_Remote("queue");
//            for (int i = 0; i < 10; i++) {
                HashMap map = new HashMap();
                map.put("1", "shanyao");
                producer_remote.sendMessage(map);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
