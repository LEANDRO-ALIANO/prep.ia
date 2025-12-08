package com.prep.ia.prep.ia.repository;

import com.prep.ia.prep.ia.model.Job;
import com.prep.ia.prep.ia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {
}
