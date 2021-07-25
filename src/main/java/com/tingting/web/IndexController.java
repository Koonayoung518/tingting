package com.tingting.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {
    @GetMapping("/")
    public String main(){
        return "main";
    }
    @GetMapping("/login")
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
    @GetMapping("/random")
    public String random(){ return "random"; }
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
    @GetMapping("/callcenter")
    public String callcenter() {return "callcenter";}
    @GetMapping("/find_id")
    public String find_id() {return "find_id";}
    @GetMapping("/notice_id")
    public String notice_id() {return "notice_id";}
    @GetMapping("findpassword")
    public String findpassword(){ return "findpassword"; }
    @GetMapping("changepassword")
    public String changepassword(){ return "changepassword"; }
    @GetMapping("practice")
    public String practice(){ return "practice"; }
    @GetMapping("terms")
    public String terms(){ return "terms"; }
}


