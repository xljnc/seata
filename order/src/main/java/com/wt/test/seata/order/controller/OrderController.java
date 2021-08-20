package com.wt.test.seata.order.controller;


import com.wt.test.seata.order.api.OrderApi;
import com.wt.test.seata.order.dto.OrderCreateDTO;
import com.wt.test.seata.order.entity.OrderDO;
import com.wt.test.seata.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author 一贫
 * @since 2021-08-20
 */
@RestController
@Valid
public class OrderController implements OrderApi {

    @Autowired
    private OrderService orderService;

    @Override
    public Long createOrder(OrderCreateDTO createDTO) {
        OrderDO orderDO = OrderDO.builder().customerId(createDTO.getCustomerId()).amount(createDTO.getAmount()).productId(createDTO.getProductId()).build();
        orderService.insert(orderDO);
        return orderDO.getId();
    }
}

