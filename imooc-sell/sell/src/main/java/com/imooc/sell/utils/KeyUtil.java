package com.imooc.sell.utils;

import java.util.Random;

/**
 * @description:
 * @author: wtx
 * @createDate: 2020/5/23
 */
public class KeyUtil {

    /*
    * 生成唯一的主键
    * 格式：时间+随机数
    * */
    public static synchronized String genUniqueKey(){

        Random random = new Random();
        //六位随机数, 加100000是为了确保随机数为6位
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
