package com.homedepot.authoring.techtalk.it

import com.homedepot.authoring.techtalk.Application
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * Base class for all Integration tests to extend.
 * If you require an embedded Cassandra instance, extend AbstractSpringCassandraTestSupport
 * If you require an embedded Postgres instance, extend AbstractPostgresTestSupport
 */
@ContextConfiguration(classes = Application.class, initializers = [ConfigFileApplicationContextInitializer.class])
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@ActiveProfiles("it")
@Import([IntegrationTestMockingConfig])
class AbstractIT extends Specification {

    def setup() {
        // Example DDL setup for Cassandra
        // getCassandraSession().execute(this.getClass().getResource("/ddl/productinfo_keyspace.cql").text)

        // Example DDL setup for Postgres
        // execute(getClass().getResource("/ddl/sku/sku.sql").text)
    }
}
