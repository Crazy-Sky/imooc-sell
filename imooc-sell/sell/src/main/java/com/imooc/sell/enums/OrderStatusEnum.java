package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @description: 订单状态枚举
 * @author: wtx
 * @createDate: 2020/5/23
 */
@Getter
public enum  OrderStatusEnum {

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消"),
    ;

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
