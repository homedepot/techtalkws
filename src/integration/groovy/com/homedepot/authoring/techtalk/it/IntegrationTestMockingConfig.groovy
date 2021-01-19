package com.homedepot.authoring.techtalk.it


import org.springframework.boot.test.context.TestConfiguration
import spock.mock.DetachedMockFactory

@TestConfiguration
class IntegrationTestMockingConfig {
    private DetachedMockFactory factory = new DetachedMockFactory()

}