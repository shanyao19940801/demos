package com.rabbitmq.direct;

import org.springframework.amqp.utils.SerializationUtils;

import java.io.IOException;
import java.io.Serializable;

public class Producer_02 extends EndPoint {
    public Producer_02(String endpointName) throws Exception {
        super(endpointName);
    }

    public void sendMessage(Serializable object) throws IOException {
        channel.basicPublish("", endPointName, null, SerializationUtils.serialize(object));
    }

}
