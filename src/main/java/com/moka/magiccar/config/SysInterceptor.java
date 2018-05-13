package com.moka.magiccar.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.invoke.MethodHandle;

/**
 * 拦截器
 *
 * @author by kunlun
 * @version <0.1>
 * @created on 2018/5/12.
 */
@Configuration
public class SysInterceptor implements HandlerInterceptor {

    private final static Logger LOGGER = LoggerFactory.getLogger(SysInterceptor.class);

    private NamedThreadLocal<Long> startTimeThreadLocal = new NamedThreadLocal<Long>("startTime-endTime");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Long startTime = System.currentTimeMillis();
        startTimeThreadLocal.set(startTime);
        LOGGER.info("请求地址:{}", request.getRequestURI());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        Long endTime = System.currentTimeMillis();
        Long startTime = startTimeThreadLocal.get();
        LOGGER.info("请求耗时:{}毫秒", endTime - startTime);
    }
}
