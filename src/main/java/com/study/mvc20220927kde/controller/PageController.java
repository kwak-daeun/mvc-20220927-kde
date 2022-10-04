package com.study.mvc20220927kde.controller;

import com.study.mvc20220927kde.dto.TestReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PageController {

    @GetMapping("/test1") /*get 읽는다 괄호 안에 uri 넣어주기 요청주소*/
    public String test1() { /*메소드 호출*/
        return "test_page1"; /*응답데이터*/
    }


    @GetMapping("/test2") /*get 읽는다 괄호 안에 uri 넣어주기 요청주소*/
    public String test2() { /*메소드 호출*/
        System.out.println("test2");
        return "test/test_page2"; /*응답데이터*/
    }


    @GetMapping("/test3")
    public String test3(Model model, @RequestParam String strData, @RequestParam String name) {
        System.out.println(strData);
        System.out.println(name);

        model.addAttribute("data", strData);
        model.addAttribute("name", name);
        return "test/test_page3";
    }

    @GetMapping("/test4")
    public String test4(Model model, TestReqDto testReqDto) {

        System.out.println(testReqDto);


        model.addAttribute("data", testReqDto.getStrData());
        model.addAttribute("name", testReqDto.getName());
        model.addAttribute("number", testReqDto.getNumber());

        return "test/test_page4";
    }
}





