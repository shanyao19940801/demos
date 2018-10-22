package com.rabbitmq;


import org.springframework.amqp.utils.SerializationUtils;

import java.io.Serializable;

public class Producer_01 extends EndPoint {

    public Producer_01(String endpointName) throws Exception {
        super(endpointName);
    }

    public void sendMessage(Serializable object) throws Exception {
        channel.basicPublish("",endPointName, null, SerializationUtils.serialize(object));
    }
}
