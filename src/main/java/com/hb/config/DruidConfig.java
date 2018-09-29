package com.hb.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {

    /**
     * 配置datasource
     *
     * @return
     */
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid() {
        return new DruidDataSource();
    }

    /**
     * 配置druid监控
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        //配置参数 见源码
        Map<String, String> parameters = new HashMap<>();
        parameters.put("loginUsername", "admin");
        parameters.put("loginPassword", "admin123");
        parameters.put("allow", "");//允许所有人访问
        bean.setInitParameters(parameters);
        return bean;
    }

    /**
     * 配置拦截器
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        //配置参数 见源码
        Map<String, String> parameters = new HashMap<>();
        parameters.put("exclusions", "/druid/*");//设置不拦截的请求
        bean.setInitParameters(parameters);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }
}
