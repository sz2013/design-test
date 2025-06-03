package com.zjf.designtest;

import com.zjf.designtest.Singleton.EagerSingleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesigntestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesigntestApplication.class, args);

        EagerSingleton instance = EagerSingleton.getInstance();
    }

}
