package com.imooc.sell.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @description: 订单的传输对象，在各层之间交流传输使用
 * @author: wtx
 * @createDate: 2020/5/23
 */
@Data
//如果某个属性的值为空，又必须返回？ -> 初始化，如 orderDetailList
@JsonInclude(JsonInclude.Include.NON_NULL)      //如果属性为空就不返回
public class OrderDTO {

    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    //不直接与数据库交流，不用设置默认值
    private Integer orderStatus;
    private Integer payStatus;
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    //和对应的订单详请对象关联起来
    private List<OrderDetail> orderDetailList = new ArrayList<>();
}
