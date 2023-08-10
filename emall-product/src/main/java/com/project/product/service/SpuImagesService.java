package com.project.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.common.utils.PageUtils;
import com.project.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author lmf
 * @email 1902736346@qq.com
 * @date 2023-08-10 14:09:49
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

