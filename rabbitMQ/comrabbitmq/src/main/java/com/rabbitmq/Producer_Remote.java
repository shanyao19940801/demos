package com.rabbitmq;


import org.springframework.amqp.utils.SerializationUtils;

import java.io.Serializable;

public class Producer_Remote extends EndPoint {

    public Producer_Remote(String endpointName) throws Exception {
        super(endpointName);
    }

    public void sendMessage(Serializable object) throws Exception {
        channel.basicPublish("",endPointName, null, SerializationUtils.serialize(object));
    }
}
