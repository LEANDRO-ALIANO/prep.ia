package com.prep.ia.prep.ia.service;

import com.google.api.client.util.Value;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import com.prep.ia.prep.ia.model.Job;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AIService {
    private final Client client;

    public AIService() {
        String apiKey = System.getenv("GEMINI_API_KEY"); // PEGANDO VARIÁVEL DE AMBIEN
        this.client = Client.builder()
                .apiKey(apiKey)
                .build();
    }

    public String generetedQuestions(Optional<Job> job1) {
        Job job = job1.get();
        String prompt = String.format("Gere perguntas de entrevista para o cargo '%s' na área '%s', nível %s. Descrição: %s",
                job.getJobName(),
                job.getArea(),
                job.getLevelEnum(),
                job.getDescription());
        GenerateContentResponse response=
                client.models.generateContent(
                        "gemini-2.5-flash",
                        prompt,
                        null);

        return response.toString();
    }
}
