package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory one = categoryService.findOne(1);
        System.out.println(one);
    }

    @Test
    public void findAll() {
        List<ProductCategory> all = categoryService.findAll();
        System.out.println(all);
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        categoryService.findByCategoryTypeIn(list);
    }

    @Test
    public void save() {
        ProductCategory category = new ProductCategory(null,"二手精品",4);
        categoryService.save(category);
    }
}