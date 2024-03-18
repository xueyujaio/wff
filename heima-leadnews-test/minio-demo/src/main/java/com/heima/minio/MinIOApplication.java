package com.heima.minio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Project: heima-leadnews
 * @Package: com.heima.minio
 * @ClassName: MinIOApplication
 * @Description: TODO
 * @Author: xueyujiao
 * @Date: 2024/3/18
 * @Version 1.0
 */
@SpringBootApplication
public class MinIOApplication {
    public static void main(String[] args) {
        SpringApplication.run(MinIOApplication.class, args);
        System.out.println("o(*￣▽￣*)ブ minio 启动成功 o(*￣▽￣*)ブ");
    }
}
