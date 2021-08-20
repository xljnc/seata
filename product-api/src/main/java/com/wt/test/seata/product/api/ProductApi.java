package com.wt.test.seata.product.api;

import com.wt.test.seata.product.dto.StockUpdateDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author 一贫
 * @date 2021/8/20
 */
@RequestMapping("/product")
public interface ProductApi {

    @PostMapping("/stock/update")
    Boolean updateStock(@RequestBody @Valid StockUpdateDTO updateDTO);
}
