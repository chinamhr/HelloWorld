/**
 * Copyright (C) 2017 codeFlagAI, Inc. All Rights Reserved.
 */
package com.spring.mhr.advice;

/**
 * @author xiaoyuan
 *
 */
public class NaiveWaiter implements Waiter{

    /* (non-Javadoc)
     * @see com.spring.mhr.advice.Waiter#greetTo(java.lang.String)
     */
    @Override
    public void greetTo(String name) {
        System.out.println("greet to "+name+"...");
    }

    /* (non-Javadoc)
     * @see com.spring.mhr.advice.Waiter#serveTo(java.lang.String)
     */
    @Override
    public void serveTo(String name) {
        System.out.println("serving "+name+"...");
    }

}
