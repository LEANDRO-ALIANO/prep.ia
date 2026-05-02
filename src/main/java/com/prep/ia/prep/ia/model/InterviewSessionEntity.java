package com.prep.ia.prep.ia.model;

import com.prep.ia.prep.ia.Enum.Status;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Lob;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class InterviewSessionEntity {

    @Id
    private String id;

    private Long jobId;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Lob
    private String history;

    private Integer questionCount;

    private Double score;

    private LocalDateTime createdAt;
}
