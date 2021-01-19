package com.homedepot.authoring.techtalk.repository;

import com.homedepot.authoring.techtalk.domain.TestEntity;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository  extends CrudRepository<TestEntity, Long> {
    TestEntity findById(final long id);

}
