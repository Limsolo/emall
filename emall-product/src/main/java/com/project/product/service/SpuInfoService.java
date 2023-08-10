package com.project.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.common.utils.PageUtils;
import com.project.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author lmf
 * @email 1902736346@qq.com
 * @date 2023-08-10 14:09:49
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

