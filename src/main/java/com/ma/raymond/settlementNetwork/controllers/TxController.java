package com.ma.raymond.settlementNetwork.controllers;

import com.ma.raymond.settlementNetwork.services.MQSender;
import org.springframework.beans.factory.annotation.Autowired;
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
