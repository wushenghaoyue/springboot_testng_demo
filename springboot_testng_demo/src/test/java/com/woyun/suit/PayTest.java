package com.woyun.suit;

import com.yourcompany.MySpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest(classes = {MySpringBootApplication.class})
public class PayTest extends AbstractTestNGSpringContextTests {

    @Test
    public  void paySuccess(){
        Assert.assertTrue(1==2);
        System.out.println("支付宝支付成功");
    }
}
