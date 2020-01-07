package com.mage.crm.controller;

import com.mage.crm.model.MessageModel;
import com.mage.crm.model.User;
import com.mage.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("userLogin")
    @ResponseBody
    public MessageModel login(String userName, String userPwd){
        MessageModel message = userService.login(userName, userPwd);
        return message;
    }
    @RequestMapping("list")
    @ResponseBody
    public List<User> findAll() {
        List<User> users = userService.findAll();
        return users;
    }

    @RequestMapping("update")
    @ResponseBody
    public String updateTrueName(String trueName, Integer userId){
        userService.updateTrueName(userId, trueName);
        return "success";
    }


}
