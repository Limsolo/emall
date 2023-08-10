package com.project.product.dao;

import com.project.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lmf
 * @email 1902736346@qq.com
 * @date 2023-08-10 14:09:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
