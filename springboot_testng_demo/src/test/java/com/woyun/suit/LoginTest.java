package com.woyun.suit;

import com.yourcompany.MySpringBootApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@Slf4j
@SpringBootTest(classes = {MySpringBootApplication.class})
public class LoginTest extends AbstractTestNGSpringContextTests {

    @Test
    public void loginTaoBao(){
        System.out.println("淘宝登陆成功");
        logger.info("logger");
    }

}
