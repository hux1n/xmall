package com.hu.xmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hu.common.utils.PageUtils;
import com.hu.xmall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author hux
 * @email 1184191598@qq.com
 * @date 2022-03-10 16:02:51
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

