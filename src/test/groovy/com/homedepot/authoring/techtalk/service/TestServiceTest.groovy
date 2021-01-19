package com.homedepot.authoring.techtalk.service

import com.homedepot.authoring.techtalk.repository.TestRepository
import com.homedepot.authoring.techtalk.domain.TestEntity
import spock.lang.Specification

class TestServiceTest extends Specification {
    def testService
    TestRepository testRepository

    def setup() {
        testRepository = Mock()
        testService = new TestService(testRepository)

    }

    def "get test makes expected request to test repository and returns the result."() {
        given:
            TestEntity test = Mock()
            testRepository.findById(1) >> test

        when:
            def result = testService.getTest(1)

        then:
            result == test

    }
}
