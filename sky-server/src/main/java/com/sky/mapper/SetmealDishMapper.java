package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品Id查询对应的套餐Id
     * @param dishIds
     * @return
     */

    List<Long> getSetmealIdsByDishIds(@Param("dishIds")List<Long> dishIds);

    /**
     * 批量保存套餐和菜品的关联关系
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);

    void deleteBySetmealId(List<Long> ids);

    @Select("select * from setmeal_dish where setmeal_id =#{setmealId}")
    List<SetmealDish> getBySetmealId(Long setmealId);
}
