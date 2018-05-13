package com.moka.magiccar.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author by kunlun
 * @version <0.1>
 * @created on 2018/5/13.
 */
@Configuration
public class DruidConfig {

    private final static Logger LOGGER = LoggerFactory.getLogger(DruidConfig.class);

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.type}")
    private String type;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String password;


    @Bean
    public DataSource init() {
        LOGGER.info("加载本地化数据库配置***");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        LOGGER.info("加载本地数据库配置结束***");
        return dataSource;
    }

}
