package com.project.order.dao;

import com.project.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lmf
 * @email 1902736346@qq.com
 * @date 2023-08-10 14:20:24
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
