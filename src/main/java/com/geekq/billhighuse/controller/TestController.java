package com.geekq.billhighuse.controller;

import com.geekq.billhighuse.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 邱润泽 bullock
 */

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private testService  testService;


    @ResponseBody
    @RequestMapping("/go")
    public String getTestData(){

        int ho = testService.testNum();
        System.out.println(ho);
        return "2222222";
    }
}
