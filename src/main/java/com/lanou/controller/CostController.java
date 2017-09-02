package com.lanou.controller;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Cost;
import com.lanou.service.CostService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.Timestamp;


/**
 * Created by dllo on 17/8/30.
 */
@Controller
public class CostController {
    @Resource
    private CostService service;

    //主页
    @RequestMapping(value = "/")
    public String frontPage(){
        return "index";
    }

    //资费管理
    @RequestMapping(value = "/fee/fee_list")
    public String toCost(){
        return "fee/fee_list";
    }

    //查找全部
    @RequestMapping(value = "/getCostList")
    @ResponseBody
    public PageInfo<Cost> findAll(@RequestParam("pageNum") Integer pn,@RequestParam("pageSize") Integer ps){

        PageInfo<Cost> pageInfo = service.findAll(pn, ps);

        return pageInfo;
    }

    //跳转添加页面
    @RequestMapping(value = "/feeadd")
    public String toAdd(){
        return "fee/fee_add";
    }

    //添加
    @RequestMapping(value = "/addCost")
    public String add(Cost cost){
        service.addCost(cost);
        return "fee/fee_list";
    }

    //跳转修改页面
    @RequestMapping(value = "/fee_modi")
    public String toModify(@RequestParam("cost_id") Integer id){
        service.findById(id);

        return "fee/fee_modi";
    }

    //修改
    @RequestMapping(value = "/modifyCost")
    public String modify(Cost cost){
        service.update(cost);
        return "fee/fee_list";
    }

    //跳转单独显示页面
    @RequestMapping(value = "/feedetail")
    public String findByID(){
        return "fee/fee_detail";
    }












}
