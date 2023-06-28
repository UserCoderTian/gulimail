package com.tsb.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsb.common.utils.PageUtils;
import com.tsb.gulimail.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author SongBo
 * @email 616907739@gmail.com
 * @date 2023-06-28 19:15:15
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

