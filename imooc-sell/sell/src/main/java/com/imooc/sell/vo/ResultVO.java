package com.imooc.sell.vo;

import lombok.Data;

/**
 * @description: 返回给前端的view object
 * @author: wtx
 * @createDate: 2020/5/20
 */
@Data
/*@JsonInclude(JsonInclude.Include.NON_NULL)*/
public class ResultVO<T> {

    private Integer code;      //0为成功，1为失败
    private String msg;
    private T data;
}
