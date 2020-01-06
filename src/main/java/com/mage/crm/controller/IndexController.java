package com.mage.crm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class IndexController {
    @RequestMapping("")
    @ResponseBody
    public String index(String name, String password) {
        log.debug("打印传入的name={}, password={}", name, password);
        return "index";
    }
}
