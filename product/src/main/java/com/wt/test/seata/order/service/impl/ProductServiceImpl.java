package com.wt.test.seata.order.service.impl;


import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import com.wt.husky.mybatis.plus.sevice.impl.BaseServiceImpl;
import com.wt.test.seata.order.entity.ProductDO;
import com.wt.test.seata.order.mapper.ProductMapper;
import com.wt.test.seata.order.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateWithVersion(ProductDO productDO) {
        LambdaUpdateWrapper<ProductDO> updateWrapper = Wrappers.lambdaUpdate();
        updateWrapper.eq(ProductDO::getId, productDO.getId());
        updateWrapper.eq(ProductDO::getVersion, productDO.getVersion());
        productDO.setVersion(productDO.getVersion() + 1L);
        return SqlHelper.retBool(getBaseMapper().update(productDO, updateWrapper));
    }
}
