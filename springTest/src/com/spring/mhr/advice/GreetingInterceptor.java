/**
 * Copyright (C) 2017 codeFlagAI, Inc. All Rights Reserved.
 */
package com.spring.mhr.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author xiaoyuan
 *
 */
public class GreetingInterceptor implements MethodInterceptor {

    /* (non-Javadoc)
     * @see org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.intercept.MethodInvocation)
     */
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] args = invocation.getArguments();
        String clientName=(String)args[0];
        
        return null;
    }

}
