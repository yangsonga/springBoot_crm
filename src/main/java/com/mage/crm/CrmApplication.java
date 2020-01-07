package com.mage.crm;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mage.crm.mapper") // 扫描MyBatis的mapper接口
@Slf4j
public class CrmApplication {

    public static void main(String[] args) {
        log.info("hahahaha...");
       SpringApplication.run(CrmApplication.class,args);
    }

}
