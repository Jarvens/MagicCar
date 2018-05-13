package com.moka.magiccar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;


/**
 * @author by kunlun
 * @version <0.1>
 * @created on 2018/5/12.
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 重写消息转换  fastJson
     * 默认的jackson 相比 fastJson 数据量比较大
     *
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {


    }

    /**
     * 注入拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SysInterceptor());
    }


}
