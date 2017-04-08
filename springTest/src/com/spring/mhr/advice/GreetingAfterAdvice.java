/**
 * Copyright (C) 2017 codeFlagAI, Inc. All Rights Reserved.
 */
package com.spring.mhr.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author xiaoyuan
 *
 */
public class GreetingAfterAdvice implements AfterReturningAdvice{

    /* (non-Javadoc)
     * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
     */
    @Override
    public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
       System.out.println("Please enjoy yourself"); 
    }

}
