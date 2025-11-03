package com.gkfcsolution.notitifcationsystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * Created on 2025 at 17:36
 * File: null.java
 * Project: notitifcation-system
 *
 * @author Frank GUEKENG
 * @date 03/11/2025
 * @time 17:36
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic"); // /topic/xxx
        config.setApplicationDestinationPrefixes("/app");
//        WebSocketMessageBrokerConfigurer.super.configureMessageBroker(registry);
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws")
                .setAllowedOriginPatterns("http://localhost:63342")
                .withSockJS();

//        WebSocketMessageBrokerConfigurer.super.registerStompEndpoints(registry);
    }
}
