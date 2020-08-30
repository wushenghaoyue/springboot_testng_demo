package com.yourcompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//声明该类是一个SpringBoot引导类
@SpringBootApplication
public class MySpringBootApplication {
    //main是java程序的入口
    public static void main(String[] args) {
        //run方法表示要运行springboot的引导类，
        // run参数就是springboot引导类的字节码对象
        SpringApplication.run(MySpringBootApplication.class);
    }
}
