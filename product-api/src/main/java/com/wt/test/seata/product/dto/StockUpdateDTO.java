package com.wt.test.seata.product.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 一贫
 * @date 2021/8/20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StockUpdateDTO implements Serializable {

    private Long productId;

    /**
     * 需要扣减的库存量
     */
    private Long amount;
}
