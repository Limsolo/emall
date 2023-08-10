package com.project.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.common.utils.PageUtils;
import com.project.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author lmf
 * @email 1902736346@qq.com
 * @date 2023-08-10 14:09:49
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

