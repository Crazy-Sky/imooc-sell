package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @description: 商品的service
 * @author: wtx
 * @createDate: 2020/5/20
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    //查询所有上架的商品
    List<ProductInfo> findUpAll();

    //注意分页，org.springframework.data.domain.Pageable
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
