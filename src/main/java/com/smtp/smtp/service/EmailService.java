package com.smtp.smtp.service;

import com.smtp.smtp.entity.SmtpProvider;
import com.smtp.smtp.repository.SmtpProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private SmtpService smtpService;

    @Autowired
    private SmtpProviderRepository smtpProviderRepository;

    public void sendSimpleEmail(String to, String subject, String html, Long id) {
        smtpService.setSmtpConfig(id);
        SmtpProvider smtpProvider = smtpProviderRepository.findById(id).orElseThrow();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(html);
        message.setFrom(smtpProvider.getProviderName());

        mailSender.send(message);
    }
}
