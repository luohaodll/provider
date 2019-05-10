/**
 * Copyright (c) 2019,TravelSky.
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 */
package com.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ADH
 * <p> 
 * 体现设计意图的说明
 *
 * @author luohao
 *
 *
 */
@RestController
public class ProviderController {
    @Autowired
    private KafkaTemplate<String,String> template;

    @GetMapping(value="provider")
    public String send(String topic,String key,String value){
        template.send(topic,key,value);
        return "success";
    }
}
