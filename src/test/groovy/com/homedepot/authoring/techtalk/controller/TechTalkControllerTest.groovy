package com.homedepot.authoring.techtalk.controller


import com.homedepot.authoring.techtalk.service.TestService
import org.springframework.http.HttpStatus
import spock.lang.Specification

class TechTalkControllerTest extends Specification {
    def controller
    TestService testService = Mock()

    def setup() {
        controller = new TechTalkController(testService)
    }

    def "reportStatus returns expected response entity"() {
        when:
            def status = controller.reportStatus()

        then:
            status != null
            status.getStatusCode() == HttpStatus.OK
            status.getBody() == "Status: UP"

    }
}
