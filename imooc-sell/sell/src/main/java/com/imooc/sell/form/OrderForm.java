package com.imooc.sell.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @description: 订单的表单验证对象
 * @author: wtx
 * @createDate: 2020/5/23
 */
@Data
public class OrderForm {

    @NotEmpty(message = "姓名必选")
    private String name;
    @NotEmpty(message = "手机号未填")
    private String phone;
    @NotEmpty(message = "地址必填")
    private String address;
    @NotEmpty(message = "openid必选")
    private String openid;
    @NotEmpty(message = "购物车不能为空")
    private String items;
}
