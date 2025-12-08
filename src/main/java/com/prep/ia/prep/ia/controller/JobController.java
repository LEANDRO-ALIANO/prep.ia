package com.prep.ia.prep.ia.controller;

import com.prep.ia.prep.ia.DTO.JobDTO;
import com.prep.ia.prep.ia.model.Job;
import com.prep.ia.prep.ia.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/job")
public class JobController {
    @Autowired
    JobService service;
    @PostMapping("/saveJob/{userId}")
    public ResponseEntity<Job> saveJob(@PathVariable  Long userId, @RequestBody JobDTO data) throws Exception {
        Job savedJob = service.saveJob(userId,data);
        return ResponseEntity.ok().body(savedJob);
    }


}
