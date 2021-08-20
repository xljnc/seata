package com.wt.test.seata.order.service.impl;


import com.wt.husky.mybatis.plus.sevice.impl.BaseServiceImpl;
import com.wt.test.seata.order.entity.OrderDO;
import com.wt.test.seata.order.mapper.OrderMapper;
import com.wt.test.seata.order.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author 一贫
 * @since 2021-08-20
 */
@Service
public class OrderServiceImpl extends BaseServiceImpl<OrderMapper, OrderDO> implements OrderService {

}
