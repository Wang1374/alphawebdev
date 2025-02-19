package com.adGenAIpha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan(value = {"com.adGenAIpha.mapper"})
public class AdGenAIPhaMain {
    public static void main(String[] args) {
        SpringApplication.run(AdGenAIPhaMain.class);
    }
}
