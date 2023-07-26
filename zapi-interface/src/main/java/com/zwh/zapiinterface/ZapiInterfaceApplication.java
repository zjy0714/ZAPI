package com.zwh.zapiinterface;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.yupi.yuapiinterface.mapper"})
public class ZapiInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZapiInterfaceApplication.class, args);
    }

}
