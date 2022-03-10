package com.hu.xmall.coupon.dao;

import com.hu.xmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hux
 * @email 1184191598@qq.com
 * @date 2022-03-10 15:44:23
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
