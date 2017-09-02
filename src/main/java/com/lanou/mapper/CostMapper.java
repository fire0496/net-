package com.lanou.mapper;

import com.lanou.bean.Cost;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dllo on 17/8/30.
 */
@Repository
public interface CostMapper {

    List<Cost> findAll();

    Cost findById(@Param("id")Integer id);

    void update(Cost cost);

    void addCost(Cost cost);

    void deleteCost(@Param("id")Integer id);

    Cost findBylast();


}
