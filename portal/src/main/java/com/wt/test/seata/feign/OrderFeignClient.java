package com.wt.test.seata.feign;

import com.wt.husky.feign.config.FeignMvcConfig;
import com.wt.test.seata.order.api.OrderApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author 一贫
 * @date 2021/8/20
 */
@FeignClient(name = "order",configuration = FeignMvcConfig.class,path = "/order")
public interface OrderFeignClient extends OrderApi {
}
