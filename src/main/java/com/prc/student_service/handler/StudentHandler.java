package com.prc.student_service.handler;

import com.prc.student_service.model.StudentDTO;
import com.prc.student_service.service.IStudentService;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class StudentHandler {
    private final IStudentService studentService;

    StudentHandler(IStudentService studentService){
        this.studentService = studentService;
    }
    public Mono<ServerResponse> getAllStudents(ServerRequest serverRequest){
        Flux<StudentDTO> allStudents = studentService.getAllStudents();
        return ServerResponse.ok().body(allStudents, StudentDTO.class);
    }
}
