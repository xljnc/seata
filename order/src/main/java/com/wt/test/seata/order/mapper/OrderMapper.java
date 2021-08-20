package com.wt.test.seata.order.mapper;

import com.wt.husky.mybatis.plus.mapper.BatchBaseMapper;
import com.wt.test.seata.order.entity.OrderDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author 一贫
 * @since 2021-08-20
 */
@Mapper
public interface OrderMapper extends BatchBaseMapper<OrderDO> {

}
