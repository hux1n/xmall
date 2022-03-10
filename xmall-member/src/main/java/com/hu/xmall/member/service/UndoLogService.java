package com.hu.xmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hu.common.utils.PageUtils;
import com.hu.xmall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author hux
 * @email 1184191598@qq.com
 * @date 2022-03-10 15:52:54
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

