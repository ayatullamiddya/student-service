package com.prc.student_service;

import com.prc.student_service.handler.StudentHandler;
import com.prc.student_service.openApi.StudentOpenApi;
import org.springdoc.webflux.core.fn.SpringdocRouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;


@Configuration
public class Router {
        public static final String prefix = "v1/studentapi/";
       /* @Bean
        RouterFunction<ServerResponse> studentsRoute(StudentHandler handler){
            return RouterFunctions.route(GET("students").and(accept(MediaType.APPLICATION_JSON)),handler::getAllStudents);
        }*/


        @Bean
        RouterFunction<ServerResponse> studentsRoute1(StudentHandler handler){
           return SpringdocRouteBuilder.route()
                    .GET(prefix+"students",handler::getAllStudents, StudentOpenApi.studentGetAllStudentsAPI())
                   .build();
        }
}
