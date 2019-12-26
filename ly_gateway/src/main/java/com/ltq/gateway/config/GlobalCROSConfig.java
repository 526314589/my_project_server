package com.ltq.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Author: liutieqiang
 * @Date: 2019-12-26 13:31
 * @Description:
 */
@Configuration
public class GlobalCROSConfig {

    @Bean
    public CorsFilter corsFilter(){
        //1.添加cors配置信息
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //允许访问的域名
        corsConfiguration.addAllowedOrigin("http://manage.leyou.com");
        //是否允许携带cookie
        corsConfiguration.setAllowCredentials(true);
        //允许的请求方式
        corsConfiguration.addAllowedMethod(HttpMethod.DELETE);
        corsConfiguration.addAllowedMethod(HttpMethod.GET);
        corsConfiguration.addAllowedMethod(HttpMethod.POST);
        corsConfiguration.addAllowedMethod(HttpMethod.PUT);
        //允许的头信息
        corsConfiguration.addAllowedHeader("*");
        //设置跨域有效期
        corsConfiguration.setMaxAge(3600L);
        //2.添加映射路径,拦截请求的路径
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",corsConfiguration);
        //3.返回新的配置好的corsFilter
        return new CorsFilter(source);
    }
}
