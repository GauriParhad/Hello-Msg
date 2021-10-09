package com.bridgelabz.helloworld;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Slf4j



@Autowired
private HelloWorldController {

    @RequestMapping(value = {"/", "/hello", "/message"})
    public String getHelloMessage() {
        return "Hello BridgeLabz";
    }

    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    public String test1(@RequestParam String fname, @RequestParam String lname){
        return "Hello :" + fname + " " +lname;
    }

    @RequestMapping(value = "/test2/{name}" , method= RequestMethod.GET)
    public String TEST2(@PathVariable String name){
        return "Hello" +name;
    }

    @RequestMapping(value = "/test3", method = RequestMethod.PUT)
    public Student test3(@RequestBody Student student){
        return student;
    }

}
