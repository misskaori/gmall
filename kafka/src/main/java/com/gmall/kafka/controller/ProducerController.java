package com.gmall.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author toutou
 * @date by 2019/08
 */
@Controller
public class ProducerController {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;
    @RequestMapping("send")
    @ResponseBody
    public String send(String msg){
        kafkaTemplate.send("demo", msg); //使用kafka模板发送信息
        return msg;
    }
}