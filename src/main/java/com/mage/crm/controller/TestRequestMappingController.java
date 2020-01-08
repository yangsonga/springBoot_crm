package com.mage.crm.controller;

import com.mage.crm.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

//下面是对于RequestMapping注解的一些测试
@RestController //是一个组合注解，由@Controller和@ResponseBody注解组合而成，表明该controller只返回json字符串
public class TestRequestMappingController {
    //测试RequestMapping注解的method属性
    @RequestMapping(path = "/limitMethod",method = RequestMethod.POST)
    public String limitMethod(){
        return "only just post method";
    }

    //测试多个请求路径
    @RequestMapping(path = {"mutilPath","mutilPath2"})
    public String mutilPath(){
        return "test mutilPath success";
    }

    //测试路径变量
    //如果在@PathVariable注解中添加了required=false属性，则需要添加没有路径变量的映射，否则访问还是404
    @RequestMapping(path = {"variable/{page}/{size}","variable"})
    public String variable(@PathVariable(required = false) Integer page,@PathVariable(required = false) Integer size){
       return "test PathVariable:"+page+"--"+size;
    }

    //测试@RequestMapping注解的params属性
    //使用post请求时，在body里使用json格式传参时，使用对象接收参数(如果用表单传递参数，可以直接通过变量名接收)
    //使用@RequestBody来接收请求体中的对象
    @RequestMapping(path = "testParams",params = "!id")
    public String testParams(@RequestBody User user){
        return "method not allow id as parameter,success testParams："+user.getUserName();
    }

    //测试@RequestMapping中的headers属性
    //只接收请求头中媒体类型为 text/* 的请求
    @RequestMapping(path = "testHeader",headers = "Content-Type=text/*")
    public String testHeader(){
        return "test header success";
    }

    //测试@RequestHeader注解，获取指定的请求头中的数据
    @RequestMapping("getHeader")
    public String getHeader(@RequestHeader String token){
        return "token："+token;
    }

    //测试@RequestMapping中的
    // consumes(检查输入的媒体类型Content-Type)属性
    // produces(检查输出的媒体类型Content-Type)属性
    @RequestMapping(path = "getObject",produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public User getObject(){
      return new User();
    }
}
