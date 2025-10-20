package com.prc.student_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
@AutoConfigureWebTestClient(timeout = "350000")
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
