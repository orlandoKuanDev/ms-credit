package com.example.mscredit.config;

import com.example.mscredit.handler.CreditHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterConfig {
    @Bean
    public RouterFunction<ServerResponse> rutas(CreditHandler handler){
        return route(GET("/credit"), handler::findAll)
                .andRoute(GET("/credit/{id}"), handler::findById)
                .andRoute(POST("/credit"), handler::save);
    }
}
