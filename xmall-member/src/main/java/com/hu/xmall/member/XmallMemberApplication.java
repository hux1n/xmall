package com.hu.xmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.hu.xmall.member.feign")
@SpringBootApplication
public class XmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmallMemberApplication.class, args);
    }

}
