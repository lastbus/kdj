package com.xxx.rpc.sample.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RpcBootstrap {

    private static final Logger LOGGER = LoggerFactory.getLogger(RpcBootstrap.class);

    public static void main(String[] args) {
        System.out.println("start server!");
        LOGGER.debug("start server");
        new ClassPathXmlApplicationContext("spring.xml");
    }
}
