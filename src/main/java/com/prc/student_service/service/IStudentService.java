package com.prc.student_service.service;

import com.prc.student_service.model.StudentDTO;
import reactor.core.publisher.Flux;

public interface IStudentService {
   public Flux<StudentDTO> getAllStudents();
}
