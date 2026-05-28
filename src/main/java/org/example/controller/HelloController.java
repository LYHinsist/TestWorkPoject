package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController = @Controller + @ResponseBody
 * 适用于纯数据返回的 RESTful 风格的 API 接口
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    /**
     * 处理 GET 请求，路径为 /api/hello
     * @return 直接返回的字符串作为 HTTP 响应体
     */
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, This is xiaohong demo";
    }
}