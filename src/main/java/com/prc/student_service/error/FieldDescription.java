package com.prc.student_service.error;

import lombok.Data;


public enum FieldDescription {
    BadRequestResponse("There is something error with the request"),
    UnExpectedErrorResponse("An unexpected error has occured");

    private String description;

   private FieldDescription(String description) {
        this.description = description;
    }
    public String text(){
       return description;
    }
}
