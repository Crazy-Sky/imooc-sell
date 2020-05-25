package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * @description: 买家service
 * @author: wtx
 * @createDate: 2020/5/24
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancel(String openid, String orderId);
}
