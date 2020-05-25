package com.imooc.sell.dataobject;

import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @description: 订单主表
 * @author: wtx
 * @createDate: 2020/5/23
 */
@Entity
@Data
@DynamicUpdate      //自动更新修改时间
public class OrderMaster {

    @Id
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;  //订单总金额
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();    //默认为新订单
    private Integer payStatus = PayStatusEnum.WAIT.getCode();      //默认为未支付
    private Date createTime;
    private Date updateTime;

}
