package com.smtp.smtp.dto;


public class EmailDTO {
    private String to;
    private String subject;
    private String text;
    private Long idConfig;

    public EmailDTO(String to, String subject, String text, Long idConfig) {
        this.to = to;
        this.subject = subject;
        this.text = text;
        this.idConfig = idConfig;
    }

    public EmailDTO() {
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getIdConfig() {
        return idConfig;
    }

    public void setIdConfig(Long idConfig) {
        this.idConfig = idConfig;
    }
}

