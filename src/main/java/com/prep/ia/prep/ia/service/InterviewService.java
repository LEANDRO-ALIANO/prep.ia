package com.prep.ia.prep.ia.service;

import com.prep.ia.prep.ia.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InterviewService {
    @Autowired
    JobService jobService;
    @Autowired
    AIService aiService;


        public String startInterview(Long jobId) throws Exception {

            Optional<Job> job = jobService.getJobById(jobId);
            if (job.isEmpty()) {
                throw new Exception("nenhum trabalho encontrado");
            } else {
                return aiService.generetedQuestions(job);

            }

        }
    }

