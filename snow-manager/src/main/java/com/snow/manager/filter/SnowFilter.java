package com.snow.manager.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * 自定义过滤器
 * @author snow
 *
 */
public class SnowFilter implements Filter {
    private static Logger logger = LoggerFactory.getLogger(SnowFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("SnowFilter过滤器初始化...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("SnowFilter过滤器执行...");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        logger.info("SnowFilter过滤器销毁...");
    }
}
