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
    public String callAI(String prompt) {
        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.5-flash",
                        prompt,
                        null
                );

        return response.text();
    }

//    public String generetedQuestions(Optional<Job> job1, InterviewService interviewService) {
//        Job job = job1.get();
//        String prompt = String.format("""
//        Você é um entrevistador experiente.
//        Inicie uma entrevista formal para a vaga:
//
//        Nome: %s
//        Área: %s
//        Nível: %s
//        Descrição: %s
//
//        Faça apenas a primeira pergunta.
//        """,
//                job.getJobName(),
//                job.getArea(),
//                job.getLevelEnum(),
//                job.getDescription());
//        interviewService.addMessage("system", prompt);
//        String response = callAI(interviewService.getFormattedHistory());
//        interviewService.addMessage("assistant", response);
//        return response;
//    }



}
