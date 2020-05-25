package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @description: 类目service
 * @author: wtx
 * @createDate: 2020/5/20
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    //添加和更新都使用save方法
    ProductCategory save(ProductCategory productCategory);
}
