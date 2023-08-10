package com.project.coupon.dao;

import com.project.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lmf
 * @email 1902736346@qq.com
 * @date 2023-08-10 14:26:14
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
