package com.imooc.sell.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description: 购物车
 * @author: wtx
 * @createDate: 2020/5/23
 */
@Data
@AllArgsConstructor
public class CartDTO {

    private String productId;
    private Integer productQuantity;
}
