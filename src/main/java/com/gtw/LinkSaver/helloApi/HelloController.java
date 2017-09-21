package com.gtw.LinkSaver.helloApi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/{name}")
    public String sayHello(@PathVariable("name") String name){
        return "Hello "+name;
    }
}
