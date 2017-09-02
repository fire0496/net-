package com.lanou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.bean.Cost;
import com.lanou.mapper.CostMapper;
import com.lanou.service.CostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by dllo on 17/8/30.
 */
@Service
public class CostServiceImpl implements CostService {
    @Resource
    private CostMapper mapper;


    public PageInfo<Cost> findAll(Integer pageNum, Integer pageSize) {
        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 3 : pageSize;
        PageHelper.startPage(pageNum, pageSize);
        List<Cost> costList = mapper.findAll();

        PageInfo<Cost> pageInfo = new PageInfo<Cost>(costList);
        return pageInfo;
    }

    public Cost findById(Integer id) {
        return mapper.findById(id);
    }

    public void update(Cost cost) {
        mapper.update(cost);
    }

    public void addCost(Cost cost) {
        //ID没有自增长 我们自己做一个
        cost.setCost_id(mapper.findBylast().getCost_id() + 1);

        //写入状态和创建时间
        cost.setStatus("1");
        cost.setCreatime(
                new Timestamp(System.currentTimeMillis())
        );

        mapper.addCost(cost);
    }

    public void deleteCost(Integer id) {
        mapper.deleteCost(id);
    }


}
