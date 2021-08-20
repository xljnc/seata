package com.wt.test.seata.product.controller;


import com.wt.test.seata.product.api.ProductApi;
import com.wt.test.seata.product.dto.StockUpdateDTO;
import com.wt.test.seata.product.entity.ProductDO;
import com.wt.test.seata.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 * 商品表 前端控制器
 * </p>
 *
 * @author 一贫
 * @since 2021-08-20
 */
@RestController
@Valid
public class ProductController implements ProductApi {

    @Autowired
    private ProductService productService;

    @Override
    public Boolean updateStock(StockUpdateDTO updateDTO) {
        ProductDO productDO = productService.getById(updateDTO.getProductId());
        if (updateDTO.getAmount() > productDO.getStock())
            return false;
        productDO.setStock(productDO.getStock() - updateDTO.getAmount());
        return productService.updateWithVersion(productDO);
    }
}

