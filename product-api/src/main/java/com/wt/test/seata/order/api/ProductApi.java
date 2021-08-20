package com.wt.test.seata.order.api;

import com.wt.test.seata.order.dto.StockUpdateDTO;
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
