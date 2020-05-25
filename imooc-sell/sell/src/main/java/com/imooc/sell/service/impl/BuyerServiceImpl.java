package com.imooc.sell.service.impl;

import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.enums.ResultEnum;
import com.imooc.sell.exception.SellException;
import com.imooc.sell.service.BuyerService;
import com.imooc.sell.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: wtx
 * @createDate: 2020/5/24
 */
@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private OrderService orderService;

    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {

        return check(openid, orderId);
    }

    @Override
    public OrderDTO cancel(String openid, String orderId) {

        OrderDTO orderDTO = check(openid, orderId);
        if (orderDTO == null)
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);

        return orderService.cancel(orderDTO);
    }

    private OrderDTO check(String openid, String orderId){
        OrderDTO one = orderService.findOne(orderId);
        if (!one.getBuyerOpenid().equalsIgnoreCase(openid)){
            //不是本人
            log.error("【查询单个订单】openid不是本人,openid={}",openid);
            throw new SellException(ResultEnum.ORDER_OWNER_ERROR);
        }
        return one;
    }
}
