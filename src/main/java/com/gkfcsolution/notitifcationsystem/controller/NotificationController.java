package com.gkfcsolution.notitifcationsystem.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created on 2025 at 18:55
 * File: null.java
 * Project: notitifcation-system
 *
 * @author Frank GUEKENG
 * @date 03/11/2025
 * @time 18:55
 */
@Controller
@Slf4j
public class NotificationController {

    // Server Application
    @MessageMapping("/sendMessage") // /app/sendMessage
    @SendTo("/topic/notifications")
    public String sendMessage(String message) {
        log.info("Message : {}", message);
        System.out.println("NotificationController.sendMessage");
        System.out.println("message = " + message);
        return message;
    }
}
