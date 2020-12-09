package com.spittr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LiSheng
 * @date 2020/12/8 18:27
 */
@Controller("/")
public class HomeController {
    @RequestMapping("/home")
    public String home() {
        return "home";
    }
}
