package com.inebao.dao.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.inebao.dao.IBaseMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * create time: 2018/7/5
 *
 * @author iteaj
 * @since 1.0
 */
@Configuration
@MapperScan(
        markerInterface = IBaseMapper.class,
        value = "com.inebao.dao.mapper"
)
public class MybatisConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }


}
