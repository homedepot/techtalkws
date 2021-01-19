package com.homedepot.authoring.techtalk.controller;

import com.homedepot.authoring.techtalk.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class TechTalkController {

    private final TestService testService;

    @GetMapping("/admin/health")
    public ResponseEntity<String> reportStatus() {
        return ResponseEntity.ok("Status: UP");
    }

}
