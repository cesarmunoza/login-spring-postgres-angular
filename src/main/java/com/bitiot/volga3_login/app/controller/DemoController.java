package com.bitiot.volga3_login.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class DemoController {

    @PostMapping(value = "/demo")
    public String welcome(){
        return "welcome from public endpoint";
    }
}