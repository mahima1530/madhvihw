package com.parabank.demo.testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNGRetryFailedDemo {

    @Test
    public void test1(){
        System.out.println("I am in VisaConfirmationTest");
    }

    @Test()
    public void test2(){
        System.out.println("I am in test2");
    }


    @Test(retryAnalyzer = RetryAnalyser.class)
    public void test3(){
        System.out.println("I am in test3");
        Assert.assertTrue(false);
    }
}
