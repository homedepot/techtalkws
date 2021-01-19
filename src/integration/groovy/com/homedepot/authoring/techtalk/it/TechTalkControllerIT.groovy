package com.homedepot.authoring.techtalk.it


import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

class TechTalkControllerIT extends AbstractIT {

    def "test health check endpoint working"() {
        when:
        def response = new TestRestTemplate().getForEntity("http://localhost:8080/admin/health", String.class)

        then:
        response.getStatusCode() == HttpStatus.OK
        response.getBody() == "Status: UP"

    }
}
