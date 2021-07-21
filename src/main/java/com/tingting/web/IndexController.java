package com.tingting.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {
    @GetMapping("/")
    public String login(){
        return "login";
    }
    @GetMapping("/register")
    public String register(){
        return "register";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/main")
    public String main(){
        return "main";
    }
    @GetMapping("/random")
    public String random(){
        return "random";
    }
    @GetMapping("/select")
    public String select(){
        return "select";
    }
    @GetMapping("/open")
    public String open(){
        return "open";
    }
    @GetMapping("/myinfo")
    public String myinfo(){ return "myinfo"; }
    @GetMapping("/matchlist")
    public String matchlist(){ return "matchlist"; }
    @GetMapping("findpassword")
    public String findpassword(){ return "findpassword"; }
    @GetMapping("changepassword")
    public String changepassword(){ return "changepassword"; }

}


