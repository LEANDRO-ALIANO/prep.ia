package com.prep.ia.prep.ia.DTO;

public class InterviewResponse{
    private String sessionId;
    private String message;

    public InterviewResponse(String sessionId, String message) {
        this.sessionId = sessionId;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}