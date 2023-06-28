package com.tsb.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsb.common.utils.PageUtils;
import com.tsb.gulimail.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu
 *
 * @author SongBo
 * @email 616907739@gmail.com
 * @date 2023-06-28 15:57:33
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

