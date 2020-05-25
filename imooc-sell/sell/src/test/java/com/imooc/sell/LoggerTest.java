package com.imooc.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description: 日志测试
 * @author: wtx
 * @createDate: 2020/5/19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    private final static Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test01(){

        //不能输出，默认的日志级别是info
        logger.debug("debug....");
        logger.info("info...");
        logger.error("error...");
        log.error("error...by lombok");

        String name = "imooc";
        String password = "123456";
        log.info("name: {} password: {}",name,password);
    }
}
