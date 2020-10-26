package com.javaclimb.music;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 热更新 热加载
 * 1. Ctrl+Shift+A --> 搜索registry, 找到Registry..., 找到compiler.automake.allow.when.app.running, 然后勾选
 * 2. 执行快捷键Ctrl+F9才执行热加载
 * */

@SpringBootApplication
@MapperScan("com.javaclimb.music.dao")

public class MusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class, args);
    }

}
