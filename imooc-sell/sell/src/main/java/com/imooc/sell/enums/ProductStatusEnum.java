package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @description: 商品状态
 * @author: wtx
 * @createDate: 2020/5/20
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"上架"),DOWN(1,"已下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}