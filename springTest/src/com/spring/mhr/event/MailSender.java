/**
 * Copyright (C) 2017 codeFlagAI, Inc. All Rights Reserved.
 */
package com.spring.mhr.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author xiaoyuan
 *
 */
public class MailSender implements ApplicationContextAware{
    private ApplicationContext ctx;
    
    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx=ctx;
    }

    public void sendMail(String to){
        System.out.println("模拟发送邮件");
        MailSendEvent mse=new MailSendEvent(this.ctx,to);
        ctx.publishEvent(mse);
    }
}
