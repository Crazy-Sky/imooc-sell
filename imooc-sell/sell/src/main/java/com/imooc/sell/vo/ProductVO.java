package com.imooc.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @description: 类目及其对应的商品列表
 * @author: wtx
 * @createDate: 2020/5/20
 */
@Data
public class ProductVO {

    @JsonProperty("name")   //返回给前端的时候为name
    private String categoryName;    //类目名字
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
