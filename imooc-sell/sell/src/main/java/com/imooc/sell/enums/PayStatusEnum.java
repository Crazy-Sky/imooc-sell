package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @description: 支付状态枚举
 * @author: wtx
 * @createDate: 2020/5/23
 */
@Getter
public enum  PayStatusEnum {

    WAIT(0,"未支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
