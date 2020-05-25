package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @description: 异常描述枚举
 * @author: wtx
 * @createDate: 2020/5/23
 */
@Getter
public enum  ResultEnum {

    PARAM_ERROR(1,"参数错误"),

    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_STOCK_ERROR(11,"库存异常"),
    ORDER_NOT_EXIST(12,"订单不存在"),
    ORDER_DETAIL_NOT_EXIST(13,"订单详请不存在"),
    ORDER_STATUS_ERROR(14,"订单状态错误"),
    ORDER_UPDATE_FAIL(15,"订单更新失败"),
    ORDER_DETAIL_EMPTY(16,"订单中没有商品"),
    ORDER_PAY_STATUS_ERROR(17,"订单支付状态不正确"),
    CART_EMPTY(18,"购物车为空"),
    ORDER_OWNER_ERROR(19,"该订单不属于当前用户"),
    ;
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
