package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dllo on 17/9/5.
 */
@Controller
public class AccountController {

    //跳转账务管理页面
    @RequestMapping(value = "/account/account_list")
    public String toAccount(){
        return "account/account_list";
    }

    //跳转添加页面
    @RequestMapping(value ="/account/account_add")
    public String toAdd(){
        return "account/account_add";
    }

    //跳转修改页面
    @RequestMapping(value = "/account/account_modi")
    public String toModi(){
        return "account/account_modi";
    }

    //跳转查看页面
    @RequestMapping(value = "/account/account_detail")
    public String toDetail(){
        return "account/account_detail";
    }









}
