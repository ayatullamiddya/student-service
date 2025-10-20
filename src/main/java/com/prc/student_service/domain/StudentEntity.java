package com.prc.student_service.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "student")
public class StudentEntity implements Serializable {

    @Id
    @Column(name="email")
    private String email;
    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;
    @Column(name="department")
    private String department;
    @Column(name="gender")
    private String gender;
    @Column(name="coursename")
    private String coursename;


}
