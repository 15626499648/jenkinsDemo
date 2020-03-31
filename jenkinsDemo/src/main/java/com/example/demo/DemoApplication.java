package com.example.demo;

import com.example.demo.learn.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {
    @RequestMapping(value="/test")
    public String testProject(){
        return "linux jenkins！";
    }

    @RequestMapping(value="/test1")
    public String testProject1(){
        List<Demo> demoList = new ArrayList<>();
        while(true){
            demoList.add(new Demo());
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
