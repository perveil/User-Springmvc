package org.User.controller;


import com.alibaba.fastjson.JSON;
import org.User.mapper.ItemMapper;
import org.User.model.User;
import org.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping(value = "/Login")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get",method = RequestMethod.GET,produces={"text/html;charset=UTF-8;","application/json;"})
    public String ToPage(){
        return "User";
    }
    @RequestMapping(value = "/Validate",method = RequestMethod.POST,produces={"text/html;charset=UTF-8;","application/json;"})
    @ResponseBody
    public String Valideta(@RequestBody String data){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        List<User> users=userService.getUserList();
        // Date类向String 的转变，(SimpleDateFormat)simpleDateFormat.format((Date) date);
        //String 向Date的转变，(SimpleDateFormat) simpleDateFormat.parse(String(string));


        return  JSON.toJSONString(simpleDateFormat.format(users.get(0).getBirthday()));
    }

}
