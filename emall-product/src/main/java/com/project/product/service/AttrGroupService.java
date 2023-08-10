package com.project.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.common.utils.PageUtils;
import com.project.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author lmf
 * @email 1902736346@qq.com
 * @date 2023-08-10 14:09:49
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

