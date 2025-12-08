package com.prep.ia.prep.ia.service;

import com.prep.ia.prep.ia.DTO.JobDTO;
import com.prep.ia.prep.ia.model.Job;
import com.prep.ia.prep.ia.model.User;
import com.prep.ia.prep.ia.repository.JobRepository;
import com.prep.ia.prep.ia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobService {

        @Autowired
        JobRepository repository;
        @Autowired
        UserRepository userRepository;
            public Job saveJob(Long id,JobDTO dto) throws Exception {
                User user = userRepository.findById(id)
                        .orElseThrow(()->new Exception("usuario nao encontrado"));

                Job job = new Job();
                job.setJobName(dto.jobName());
                job.setDescription(dto.description());
                job.setArea(dto.area());
                job.setLevelEnum(dto.levelEnum());
                job.setUser(user);
                return repository.save(job);
            }

            public Optional<Job> getJobById(Long id){
                return repository.findById(id);
            }
    }


