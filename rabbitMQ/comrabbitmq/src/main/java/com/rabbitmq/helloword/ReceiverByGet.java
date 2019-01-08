package com.rabbitmq.helloword;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.GetResponse;

import java.util.concurrent.TimeUnit;

public class ReceiverByGet {

    private final static String QUEUE_NAME = "queue_topic_to";

    public static void main(String[] argv) throws Exception {

        Integer t = null;

        System.out.println(new Integer(0).equals(t));
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("47.100.211.121");
        factory.setUsername("shanyao");
        factory.setPassword("123456");
        factory.setPort(5672);
        factory.setVirtualHost("/");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        while (true) {
            GetResponse resp = channel.basicGet(QUEUE_NAME, true);
            if (resp == null) {
                System.out.println("Get Nothing!");
                TimeUnit.MILLISECONDS.sleep(1000);
            } else {
                String message = new String(resp.getBody(), "UTF-8");
                System.out.printf(" [    %2$s<===](%1$s) %3$s\n", "Receiver", QUEUE_NAME, message);
                TimeUnit.MILLISECONDS.sleep(500);
            }
        }
    }
}
