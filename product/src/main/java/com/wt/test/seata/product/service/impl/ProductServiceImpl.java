package com.wt.test.seata.product.service.impl;


import com.wt.husky.mybatis.plus.sevice.impl.BaseServiceImpl;
import com.wt.test.seata.product.entity.ProductDO;
import com.wt.test.seata.product.mapper.ProductMapper;
import com.wt.test.seata.product.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author 一贫
 * @since 2021-08-20
 */
@Service
public class ProductServiceImpl extends BaseServiceImpl<ProductMapper, ProductDO> implements ProductService {

}
