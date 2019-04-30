package com.snow.manager.controller;

import com.snow.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author snow
 */
@Controller
@RequestMapping("/")
public class IndexController extends BaseController {
    @RequestMapping("/{page}")
    public String toPage(
            @PathVariable("page") String page) {
        logger.info("请求进来了"+page);
        return page;
    }
}
