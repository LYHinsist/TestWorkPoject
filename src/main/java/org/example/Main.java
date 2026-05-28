package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 是 Spring Boot 的核心注解，
 * 它开启了自动配置和组件扫描。
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        // SpringApplication.run() 方法启动内置 Tomcat 并初始化整个 Spring 应用上下文
        SpringApplication.run(Main.class, args);
    }
}