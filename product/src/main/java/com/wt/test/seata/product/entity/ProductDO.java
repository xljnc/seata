package com.wt.test.seata.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author 一贫
 * @since 2021-08-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("products")
public class ProductDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 库存
     */
    private Long stock;

    /**
     * 库存
     */
    private Long version;
}
