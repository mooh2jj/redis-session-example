package com.dsg.redissessionexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {

    @GetMapping
    public String hello() {
        return "hello22~";
    }

    @GetMapping("/doSetSession")
    public String doSetSesstion(HttpSession session) {
        session.setAttribute("a", 10);
        return "세션 설정완료!";
    }

    @GetMapping("/getSession")
    public int getSession(HttpSession session) {
        return (int) session.getAttribute("a");
    }


}
