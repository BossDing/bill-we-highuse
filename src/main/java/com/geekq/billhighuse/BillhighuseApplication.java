package com.geekq.billhighuse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.geekq.billhighuse.mapper")
/**
 * 去掉 默认去数据源配置
 */
@SpringBootApplication
        (exclude = {DataSourceAutoConfiguration.class})
public class BillhighuseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillhighuseApplication.class, args);
    }

}
