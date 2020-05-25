package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @description: 商品信息
 * @author: wtx
 * @createDate: 2020/5/20
 */
@Data
@Entity
public class ProductInfo {

    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;    //注意类型
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    private Integer productStatus; //0正常，1下架
    private Integer categoryType;
}
