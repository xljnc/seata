package com.wt.test.seata.order.api;

import com.wt.test.seata.order.dto.OrderCreateDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author 一贫
 * @date 2021/8/20
 */
@RequestMapping("/order")
public interface OrderApi {

    @PostMapping("/create")
    Long createOrder(@RequestBody @Valid OrderCreateDTO createDTO);
}
