package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Cost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by dllo on 17/8/30.
 */

public interface CostService {
    PageInfo<Cost> findAll(Integer pageNum, Integer pageSize);

    Cost findById(Integer id);

    void update(Cost cost);

    void addCost(Cost cost);

    void deleteCost(Integer id);


    void modiStatus(Cost cost);
}
