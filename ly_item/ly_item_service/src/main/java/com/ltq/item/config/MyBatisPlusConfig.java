package com.ltq.item.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liutieqiang
 * @Date: 2019-12-13 10:57
 * @Description:    MyBatisPlus的配置类
 */
@Configuration
public class MyBatisPlusConfig {
    /**
     *@description  plus的性能优化
     *@params
     *@return   MyBatisPlus性能分析插件
     *@author  liutieqiang
     *@date  2019-12-13 10:58
     */
    @Bean
    public PerformanceInterceptor performanceInterceptor(){
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        //SQL执行性能分析,开发环境使用,线上不推荐, MaxTime sql最大执行时长
        performanceInterceptor.setMaxTime(1000);
        //SQL是否格式化,默认是false
        performanceInterceptor.setFormat(true);
        return performanceInterceptor;
    }
    /**
     *@description  mybatisPlus的分页插件   原理 拦截器
     *@params
     *@return   MyBatisPlus分页插件
     *@author  liutieqiang
     *@date  2019-12-13 11:07
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return  new PaginationInterceptor();
    }
}
