package com.study.mvc20220927kde.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class UserTestRestApi {

    @GetMapping("/api/test/user/rest")
    public String getUserName(){
        return "곽다은";
    }
}
