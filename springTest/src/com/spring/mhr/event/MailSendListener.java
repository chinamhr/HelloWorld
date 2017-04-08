/**
 * Copyright (C) 2017 codeFlagAI, Inc. All Rights Reserved.
 */
package com.spring.mhr.event;

import org.springframework.context.ApplicationListener;

/**
 * @author xiaoyuan
 *
 */
public class MailSendListener implements ApplicationListener<MailSendEvent> {

    @Override
    public void onApplicationEvent(MailSendEvent event) {
        MailSendEvent mse = (MailSendEvent) event;
        System.out.println("MailSenderListenner:向"+mse.getTo()+"发送");
    }
    
}
