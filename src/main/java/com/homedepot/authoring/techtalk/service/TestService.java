package com.homedepot.authoring.techtalk.service;

import com.homedepot.authoring.techtalk.repository.TestRepository;
import com.homedepot.authoring.techtalk.domain.TestEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public TestEntity getTest(final long id) {
        return testRepository.findById(id);

    }
}
