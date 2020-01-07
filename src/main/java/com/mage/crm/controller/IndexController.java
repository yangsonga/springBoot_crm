package com.mage.crm.controller;

import com.mage.crm.base.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController extends BaseController {

    @RequestMapping("main")
    public String index(String name, String password, Model model) {
        return "main";
    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }

}
