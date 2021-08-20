package com.wt.test.seata.product.mapper;


import com.wt.husky.mybatis.plus.mapper.BatchBaseMapper;
import com.wt.test.seata.product.entity.ProductDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 商品表 Mapper 接口
 * </p>
 *
 * @author 一贫
 * @since 2021-08-20
 */
@Mapper
public interface ProductMapper extends BatchBaseMapper<ProductDO> {

}
