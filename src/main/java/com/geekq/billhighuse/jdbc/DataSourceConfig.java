package com.geekq.billhighuse.jdbc;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
/**
 * @author 邱润泽 bullock
 */
@Configuration
public class DataSourceConfig {

    private Class<? extends DataSource> datasourceType = com.alibaba.druid.pool.DruidDataSource.class;

    /**
     * =============  数据源启动时加载 ===========
     * =============  多个数据源配置多个bean ============
     * ============= AbstractRoutingDataSource 启动时 把全部数据源 放到容器中 =========
     * @return
     */
    @Bean(name = "datasource1")
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    public DataSource dataSource1() {
        System.out.println(DataSourceBuilder.create().type(datasourceType).build());
        return DataSourceBuilder.create().type(datasourceType).build();
    }

    @Bean(name = "datasource2")
    @ConfigurationProperties(prefix = "spring.datasource.db2")
    public DataSource dataSource2() {
        return DataSourceBuilder.create().type(datasourceType).build();
    }

    /**
     * 动态数据源: 通过AOP在不同数据源之间动态切换
     *
     * @Primary 启动时 必须有 否则会报错
     * @return
     */
    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(dataSource1());
        // 配置多数据源
        Map<Object, Object> dsMap = new HashMap();
        dsMap.put("datasource1", dataSource1());
        dsMap.put("datasource2", dataSource2());

        dynamicDataSource.setTargetDataSources(dsMap);
        return dynamicDataSource;
    }

    /**
     * 配置@Transactional注解事物
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dynamicDataSource());
    }}
