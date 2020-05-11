package com.ma.raymond.messageHub.controllers;

import com.ma.raymond.messageHub.services.MQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TxController {
    @Autowired
    MQSender mqSender;

    @RequestMapping("/")
    public String getAllTx() {
        mqSender.send();
        return "Hello World";
    }
}
