package com.yupi.yuapiinterface;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.yupi.yuapiinterface.mapper"})
public class YuapiInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuapiInterfaceApplication.class, args);
    }

}
