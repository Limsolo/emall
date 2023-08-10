package com.project.ware.dao;

import com.project.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lmf
 * @email 1902736346@qq.com
 * @date 2023-08-10 14:17:14
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
