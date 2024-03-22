package com.heima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: heima-leadnews
 * @Package: com.heima.controller
 * @ClassName: TestController
 * @Description: TODO
 * @Author: xueyujiao
 * @Date: 2024/3/22
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/t1")
    public void test(){
        System.out.println("测试成功！！");
    }
}
