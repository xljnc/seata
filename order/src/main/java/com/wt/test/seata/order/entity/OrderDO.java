package com.wt.test.seata.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author 一贫
 * @since 2021-08-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("orders")
public class OrderDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 买家ID
     */
    private Long customerId;

    /**
     * 商品ID
     */
    private Long productId;

}
