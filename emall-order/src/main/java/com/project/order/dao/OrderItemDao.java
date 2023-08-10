package com.project.order.dao;

import com.project.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author lmf
 * @email 1902736346@qq.com
 * @date 2023-08-10 14:20:24
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
