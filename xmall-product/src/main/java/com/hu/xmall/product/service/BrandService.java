package com.hu.xmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hu.common.utils.PageUtils;
import com.hu.xmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author hux
 * @email 1184191598@qq.com
 * @date 2022-03-10 08:17:21
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

