package com.prep.ia.prep.ia.controller;

import com.prep.ia.prep.ia.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/interview")

public class InterviewController {
    @Autowired
    InterviewService service;

    @PostMapping("startInterview/{jobId}")
    public ResponseEntity<String> startInterview(@PathVariable Long jobId) throws Exception {
        String responseqQuestions = service.startInterview(jobId);
        return ResponseEntity.ok().body(responseqQuestions);
    }
}
