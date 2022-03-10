package com.hu.xmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hu.xmall.product.dao")
public class XmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmallProductApplication.class, args);
    }

}
