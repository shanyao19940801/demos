# 
学习参考文档：
https://blog.csdn.net/phker/article/details/71211895

* 消费者down了，信息会丢失吗？

不会，只要queue存在消息就一直存在

* 消息系统的分布式可扩展的实现在于消息广播, 集群性的实现在于邮箱队列. 

Exchange: 就是邮局的概念等同于 中国邮政和顺丰快递、 
routingkey: 就是邮件地址的概念. 
queue: 就是邮箱接收软件，但是可以接收多个地址的邮件，通过bind实现。 
producer： 消息生产者，就是投递消息的程序。 
consumer：消息消费者，就是接受消息的程序。 
channel：消息通道，在客户端的每个连接里，可建立多个channel，每个channel代表一个会话任务。