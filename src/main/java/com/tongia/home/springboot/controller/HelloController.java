package com.tongia.home.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello/{hid}/world/{wid:[\\d]}",method = RequestMethod.GET)
    public String helloWorld(@PathVariable("hid") long hid, @PathVariable("wid") long wid){
        return "Hello " + hid +" Times & World!! " + wid + " Times.";
    }

}
