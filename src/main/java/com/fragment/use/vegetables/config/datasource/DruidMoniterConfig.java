package com.fragment.use.vegetables.config.datasource;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: Druid 监控配置
 * @Author: tjy
 * @Date: 2020/3/11
 */

@Configuration
@ConfigurationProperties(prefix = "druid.config")
@Data
public class DruidMoniterConfig {

    private String allow = "127.0.0.1";

    private String deny = "";

    private String loginUsername = "demo";

    private String loginPassword = "123";

    /**
     *    1、配置一个管理后台的Servlet
     */
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initParams = new HashMap<>();
        initParams.put("loginUsername",loginUsername);
        initParams.put("loginPassword",loginPassword);
        //默认就是允许所有访问
        initParams.put("allow",allow);
        //黑名单的IP
        initParams.put("deny",deny);
        //禁用HTML页面上的“REST ALL”功能
        initParams.put("resetEnable","false");
        bean.setInitParameters(initParams);
        return bean;
    }

    /**
     * 2、配置一个web监控的filter
     */
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());

        Map<String,String> initParams = new HashMap<>();
        initParams.put("exclusions","*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");

        bean.setInitParameters(initParams);

        bean.setUrlPatterns(Arrays.asList("/*"));

        return  bean;
    }
}