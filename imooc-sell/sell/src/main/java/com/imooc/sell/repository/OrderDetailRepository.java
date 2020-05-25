package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @description:
 * @author: wtx
 * @createDate: 2020/5/23
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

    //根据订单id查询对应的订单详请记录
    List<OrderDetail> findByOrderId(String orderId);
}
