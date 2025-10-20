package com.prc.student_service.mapper;

import com.prc.student_service.domain.StudentEntity;
import com.prc.student_service.model.StudentDTO;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;

@Component
public class StudentMapper {
    public Flux<StudentDTO> studentEntityToStudentDTO(List<StudentEntity> studentEntityList){
      return   Flux.fromIterable(studentEntityList).map(studentEntity -> {
                     return   StudentDTO.builder().email(studentEntity.getEmail())
                              .firstname(studentEntity.getFirstname())
                             .lastname(studentEntity.getLastname())
                             .department(studentEntity.getDepartment())
                             .gender(studentEntity.getGender())
                             .coursename(studentEntity.getCoursename())
                              .build();
        });


    }
}
