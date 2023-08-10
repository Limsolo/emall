package com.project.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.common.utils.PageUtils;
import com.project.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author lmf
 * @email 1902736346@qq.com
 * @date 2023-08-10 14:09:50
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

