package com.snow.manager.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


/**
 * 自定义servlet监听器
 * @author snow
 */
@WebListener
public class SnowServletContextListener implements ServletContextListener {
    private static Logger logger = LoggerFactory.getLogger(SnowServletContextListener.class);
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("session创建成功。");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("session销毁。");
    }
}
