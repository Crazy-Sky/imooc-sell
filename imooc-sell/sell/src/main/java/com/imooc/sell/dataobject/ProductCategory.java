package com.imooc.sell.dataobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @description: 商品类目
 * @author: wtx
 * @createDate: 2020/5/20
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate  //更新的时候updateTime会发生变化
@Table(name = "product_category") //jpa默认 驼峰转下划线，所以这里可以省略
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;
    /*private Date createTime;
    private Date updateTime;*/
}
