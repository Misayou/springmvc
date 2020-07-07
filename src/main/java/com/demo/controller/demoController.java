package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2020/7/7
 * @Description: com.demo.controller
 * @versio: 1.0
 */

@Controller
@RequestMapping("/home")
public class demoController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
