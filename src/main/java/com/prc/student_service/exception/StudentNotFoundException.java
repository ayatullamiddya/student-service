package com.prc.student_service.exception;

import org.springframework.beans.factory.annotation.Value;

public class StudentNotFoundException extends RuntimeException{

    @Value("${spring.application.name}")
    private static String serviceName;


   public StudentNotFoundException(String msg){
       super(serviceName +":"+msg);
   }
}
