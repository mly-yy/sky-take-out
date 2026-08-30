package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品Id查询对应的套餐Id
     * @param dishIds
     * @return
     */

    List<Long> getSetmealIdsByDishIds(@Param("dishIds")List<Long> dishIds);
}
