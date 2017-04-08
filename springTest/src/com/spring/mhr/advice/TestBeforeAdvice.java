/**
 * Copyright (C) 2017 codeFlagAI, Inc. All Rights Reserved.
 */
package com.spring.mhr.advice;

import java.util.Map;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaoyuan
 *
 */
public class TestBeforeAdvice {
    public static void main(String[] args){
//        Waiter target= new NaiveWaiter();
//        BeforeAdvice advice = new GreetingBeforeAdvice();
//        ProxyFactory pf = new ProxyFactory();
//        pf.setTarget(target);
//        pf.addAdvice(advice);
//        Waiter proxy=(Waiter) pf.getProxy();
//        proxy.greetTo("john");
//        proxy.serveTo("stella");
        
        String configPath = "applicationContext.xml";
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter)ctx.getBean("waiter");
        waiter.greetTo("john");
        
    }
}
