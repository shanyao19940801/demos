package com.test.rabbitmq.remotetest;

import java.util.HashMap;

public class TestRabbitmq {
    public static void main(String[] args){
        try{
            QueueConsumer consumer = new QueueConsumer("queue");
            Thread consumerThread = new Thread(consumer);
            consumerThread.start();

            Consumer_1 consumer_1 = new Consumer_1("queue");
            Thread thread1 = new Thread(consumer_1);
            thread1.start();

            Producer_Remote producer = new Producer_Remote("queue");

            for (int i = 0; i < 10; i++){
                HashMap message = new HashMap();
                message.put("message number", i);
                producer.sendMessage(message);
                System.out.println("Message Number "+ i +" sent.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
