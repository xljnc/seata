package com.wt.test.seata.controller;

import com.wt.test.seata.feign.OrderFeignClient;
import com.wt.test.seata.feign.ProductFeignClient;
import com.wt.test.seata.order.dto.OrderCreateDTO;
import com.wt.test.seata.order.dto.StockUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author 一贫
 * @date 2021/8/20
 */
@RestController
@RequestMapping("/portal")
@Valid
public class PortalController {

    @Autowired
    private OrderFeignClient orderFeignClient;

    @Autowired
    private ProductFeignClient productFeignClient;

    @PostMapping("/order/create")
    public Long createOrder(@RequestBody @Valid OrderCreateDTO orderCreateDTO) {
        StockUpdateDTO updateDTO = StockUpdateDTO.builder().productId(orderCreateDTO.getProductId())
                .amount(orderCreateDTO.getAmount()).build();
        boolean updateResult = productFeignClient.updateStock(updateDTO);
        if (!updateResult)
            return -1L;
        Long orderId = orderFeignClient.createOrder(orderCreateDTO);
        return orderId;
    }
}
