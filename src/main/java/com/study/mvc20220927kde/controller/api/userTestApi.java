package com.study.mvc20220927kde.controller.api;

import com.study.mvc20220927kde.dto.UserReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class userTestApi {

    @ResponseBody
    @PostMapping("/api/test/user/param")
    public String addUserParam
            (@RequestParam String username,
             @RequestParam String password,
             @RequestParam String name,
             @RequestParam String email){

        Map<String, String> map = new HashMap<String, String>();

        map.put("username", username);
        map.put("password", password);
        map.put("name", name);
        map.put("email",  email);

        System.out.println("map :" +toString());

        return map.toString(); /*컬렉션에 있는건 자동으로 toString*/

    }
    @ResponseBody
    @GetMapping("/api/test/user/Dto")
    public String addUserDto(UserReqDto userReqDto){

//        Map<String, String> map = new HashMap<String, String>();
//
//        map.put("username", userReqDto.getUsername());
//        map.put("password", userReqDto.getPassword());
//        map.put("name", userReqDto.getName());
//        map.put("email",  userReqDto.getEmail());
//
//        System.out.println("map :" + map.toString());


        return userReqDto.toString();
    }

    @ResponseBody
    @PostMapping("/api/test/user/json")
    public Object addUserJSON(@RequestBody UserReqDto userReqDto){ /*json은 requestbody가 있어야함*/
        List<Map<Integer, UserReqDto>> list = new ArrayList<Map<Integer, UserReqDto>>();

        Map<Integer, UserReqDto> map = null;

        for(int i=0; i<100; i++){
            if(i==0 || i %10==0){
                map = new TreeMap<Integer, UserReqDto>();
            }
            map.put(i+1, userReqDto);

            if((i-9)%10 ==0){
                list.add(map);
            }
        }
        return list;
    }

}
