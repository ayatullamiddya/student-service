package com.prc.student_service.service;

import com.prc.student_service.domain.StudentEntity;
import com.prc.student_service.mapper.StudentMapper;
import com.prc.student_service.model.StudentDTO;
import com.prc.student_service.repository.StudentRepository;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private final StudentRepository studentRepository;
    @NonNull
    private StudentMapper studentMapper;

    /*public StudentServiceImpl(StudentRepository studentRepository,StudentMapper studentMapper){
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }*/

    @Autowired
    public void setStudentMapper(@NonNull StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public Flux<StudentDTO> getAllStudents() {
        List<StudentEntity> all = studentRepository.findAll();
        return studentMapper.studentEntityToStudentDTO(all);

    }
}
