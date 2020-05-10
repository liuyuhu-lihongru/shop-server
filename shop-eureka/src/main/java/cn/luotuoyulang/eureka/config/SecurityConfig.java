package cn.luotuoyulang.eureka.config;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Description TODO
 * @Classname SecurityConfig
 * @Date 2020/3/18 23:36
 * @Created by liuyuhu
 * @Email 17600520726@163.com
 */
@Configuration
@EnableEurekaServer
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println("xiaoliu");
        System.out.println("123");
        System.out.println("李虹茹333");
        System.out.println("xiaoliu");
        System.out.println("李虹茹555");
        System.out.println("123");
        System.out.println("xiaoliu");
        System.out.println("李虹茹666");
        http.csrf().disable();
        super.configure(http);
        System.out.println("xiaoliu");
        System.out.println("123");
        System.out.println("xiaoliu");
        System.out.println("李虹茹777");
        System.out.println("123");
        System.out.println("sddddd");
        System.out.println("xiaoliu");
        System.out.println("123");
        System.out.println("werwefewf");
        System.out.println("sddddd");
    }
}
