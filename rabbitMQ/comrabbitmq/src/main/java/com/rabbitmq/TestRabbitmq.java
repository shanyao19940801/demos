package com.rabbitmq;

import java.util.HashMap;

public class TestRabbitmq {
    public static void main(String[] args){
        try{
            QueueConsumer consumer = new QueueConsumer("queue");
            Thread consumerThread = new Thread(consumer);
            consumerThread.start();

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
