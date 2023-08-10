package com.project.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.common.utils.PageUtils;
import com.project.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author lmf
 * @email 1902736346@qq.com
 * @date 2023-08-10 14:17:14
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

