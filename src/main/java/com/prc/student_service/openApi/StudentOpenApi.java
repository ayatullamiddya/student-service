package com.prc.student_service.openApi;


import com.prc.student_service.error.FieldDescription;
import com.prc.student_service.model.GenericResponse;
import com.prc.student_service.model.StudentDTO;

import org.springdoc.core.fn.builders.operation.Builder;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;


import java.util.function.Consumer;

@Configuration
public class StudentOpenApi {
    public static Consumer<Builder> studentGetAllStudentsAPI(){
        return ops-> {
            ops.operationId("getStudents")
                    .tag("getStudents")
                    .description("listing all students")
            .requestBody(org.springdoc.core.fn.builders.requestbody.Builder.requestBodyBuilder().implementation(StudentDTO.class))
                    .response(org.springdoc.core.fn.builders.apiresponse.Builder.responseBuilder()
                            .responseCode(String.valueOf(HttpStatus.OK.value()))
                            .description("Successfully fetched all students."))
                    .response(org.springdoc.core.fn.builders.apiresponse.Builder.responseBuilder()
                            .responseCode(String.valueOf(HttpStatus.BAD_REQUEST.value()))
                            .description(FieldDescription.BadRequestResponse.text())
                            .implementation(GenericResponse.class))
                    .response(org.springdoc.core.fn.builders.apiresponse.Builder.responseBuilder()
                            .responseCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()))
                            .description(FieldDescription.UnExpectedErrorResponse.text())
                            .implementation(GenericResponse.class));
        };

    }
}
