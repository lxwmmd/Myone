package com.lxwmmd.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
public class DruidConfiguration {

    @Value("${spring.datasource.url}")
private String dbUrl;
 @Value("${spring.datasource.username}")
private String username;
 @Value("${spring.datasource.password}")
private String password;
 @Value("${spring.datasource.driver-class-name}")
 private String driverClassName;
 @Value("${spring.datasource.initialSize}")
private int initialSize;
 @Value("${spring.datasource.minIdle}")
 private int minIdle;
 @Value("${spring.datasource.maxActive}")
 private int maxActive;
 @Value("${spring.datasource.maxWait}")
private int maxWait;
@Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
 private int timeBetweenEvictionRunsMillis;
 @Value("${spring.datasource.minEvictableIdleTimeMillis}")
 private int minEvictableIdleTimeMillis;
 @Value("${spring.datasource.validationQuery}")
 private String validationQuery;
 @Value("${spring.datasource.testWhileIdle}")
 private boolean testWhileIdle;
 @Value("${spring.datasource.testOnBorrow}")
 private boolean testOnBorrow;
 @Value("${spring.datasource.testOnReturn}")
private boolean testOnReturn;
 @Value("${spring.datasource.poolPreparedStatements}")
 private boolean poolPreparedStatements;
@Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
 private int maxPoolPreparedStatementPerConnectionSize;
 @Value("${spring.datasource.filters}")
 private String filters;
 @Value("{spring.datasource.connectionProperties}")
 private String connectionProperties;

 @Bean//????????????Bean??????
             @Primary //????????????DataSource??????????????????????????????DataSource
 public DataSource dataSource(){
 DruidDataSource datasource = new DruidDataSource();
 datasource.setUrl(this.dbUrl);
 datasource.setUsername(username);
datasource.setPassword(password);
 datasource.setDriverClassName(driverClassName);

 //configuration
 datasource.setInitialSize(initialSize);
 datasource.setMinIdle(minIdle);
 datasource.setMaxActive(maxActive);
 datasource.setMaxWait(maxWait);
 datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
 datasource.setValidationQuery(validationQuery);
 datasource.setTestWhileIdle(testWhileIdle);
 datasource.setTestOnBorrow(testOnBorrow);
 datasource.setTestOnReturn(testOnReturn);
 datasource.setPoolPreparedStatements(poolPreparedStatements);
 datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
 try {
 datasource.setFilters(filters);
 } catch (SQLException e) {
 System.err.println("druid configuration initialization filter: "+ e);
 }
 datasource.setConnectionProperties(connectionProperties);
 return datasource;
 }
 @Bean
 public ServletRegistrationBean statViewServlet(){
 //??????servlet????????????
 ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
 //??????ip?????????
 servletRegistrationBean.addInitParameter("allow","127.0.0.1");
 //??????ip?????????
 servletRegistrationBean.addInitParameter("deny","192.168.0.2");
 //???????????????????????????__????????????????????????
 servletRegistrationBean.addInitParameter("loginUsername","druid");
 servletRegistrationBean.addInitParameter("loginPassword","123456");
 //????????????????????????
servletRegistrationBean.addInitParameter("resetEnable","false");
return servletRegistrationBean;
 }
 @Bean
 public FilterRegistrationBean statFilter(){
 //???????????????
 FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
//???????????????????????????
 filterRegistrationBean.addUrlPatterns("/*");
 //?????????????????????
filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.png,*.css,*.ico,/druid/*");
 return filterRegistrationBean;
 }

}
