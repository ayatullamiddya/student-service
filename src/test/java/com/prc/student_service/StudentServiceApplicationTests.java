package com.prc.student_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
class StudentServiceApplicationTests {
    @Autowired
    private WebTestClient webTestClient;
    public static final String prefix = "/v1/studentapi/";

    @Value("${my.app}")
    private String appName;

	@Test
	void contextLoads() {
	}

    @Test
    public void getStudents_valid(){
        System.out.println(appName);
        webTestClient.get().uri(prefix + "students")
                .exchange().expectStatus().isEqualTo(HttpStatus.OK);

    }

}
