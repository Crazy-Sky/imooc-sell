package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @description: 订单详请表
 * @author: wtx
 * @createDate: 2020/5/23
 */
@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;
    private String orderId;
    private String productId;
    private String productName;
    private BigDecimal productPrice;    //商品价格
    private Integer productQuantity;    //商品数量
    private String productIcon;         //商品图片
}
