package com.inebao.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * create time: 2018/7/6
 *
 * @author iteaj
 * @since 1.0
 */
@Configuration
@ComponentScan(basePackages = {
        "com.inebao.web.controller",
        "com.inebao.web.api"
})
public class AppConfig {

}
