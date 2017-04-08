/**
 * Copyright (C) 2017 codeFlagAI, Inc. All Rights Reserved.
 */
package com.spring.mhr.event;


import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent; 

/**
 * @author xiaoyuan
 *
 */
public class MailSendEvent extends ApplicationContextEvent{

    private String to;
    
    /**
     * @param source
     */
    public MailSendEvent(ApplicationContext source,String to) {
        super(source);
        this.to=to;
    }
    
    public String getTo(){
        return this.to;
    }
}
