package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;


@MessagingGateway(name = "myGateway", defaultRequestChannel = "inputChannel")
public interface CustomGateway {

    @Gateway(requestChannel = "echoChannel", replyTimeout = 2, requestTimeout = 200)
    public void print (Banking person);

    @Gateway(requestChannel = "reverseEchoChannel", replyTimeout = 2, requestTimeout = 200)
    public void reverse(String message);

    @Gateway(requestChannel = "getchannel",replyTimeout = 2, requestTimeout = 200)
    public void getStudents();
}
