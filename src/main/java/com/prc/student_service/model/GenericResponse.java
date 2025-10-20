package com.prc.student_service.model;

public class GenericResponse {
    private String errorMsg;
    private boolean success;
    public GenericResponse(String errorMsg){
        this.errorMsg = errorMsg;
        this.success = false;
    }
}
