package com.hu.xmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hu.common.utils.PageUtils;
import com.hu.xmall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author hux
 * @email 1184191598@qq.com
 * @date 2022-03-10 15:44:23
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

