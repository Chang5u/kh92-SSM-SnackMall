package com.kgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author GengRang
 */
@Controller
public class LoginController {

    @RequestMapping("login")
    public String loginAction(){
        return  "login";
    }

    @RequestMapping("bill")
    public String toBill(){
        return  "bill";
    }

    @RequestMapping("home1")
    public String toHome1(){
        return  "home/home1";
    }

}
