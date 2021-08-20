package com.wt.test.seata.product.service;


import com.wt.husky.mybatis.plus.sevice.BaseService;
import com.wt.test.seata.product.entity.ProductDO;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author 一贫
 * @since 2021-08-20
 */
public interface ProductService extends BaseService<ProductDO> {
    boolean updateWithVersion(ProductDO productDO);

}
