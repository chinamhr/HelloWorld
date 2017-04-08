/**
 * Copyright (C) 2017 codeFlagAI, Inc. All Rights Reserved.
 */
package com.spring.mhr.advice;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author xiaoyuan
 *
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {

    /* (non-Javadoc)
     * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
     */
    @Override
    public void before(Method method, Object[] args, Object obj) throws Throwable {
        String clientName =(String)args[0];
        System.out.println("How are you! Mr."+clientName+".");
    }

}
