package com.hu.xmall.product.dao;

import com.hu.xmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hux
 * @email 1184191598@qq.com
 * @date 2022-03-10 08:17:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
